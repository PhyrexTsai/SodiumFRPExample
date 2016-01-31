/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.map;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import nz.sodium.Cell;
import sodium.frp.Frame;
import swidgets.SLabel;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class CellMap {
    public static void main(String[] args){
        JFrame frame = Frame.draw().template();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        STextField msg = new STextField("Hello");
        SLabel lbl = new SLabel(new Cell<String>(""));
        Cell<String> reversed = msg.text.map(t ->
            new StringBuilder(t).reverse().toString());
        lbl = new SLabel(reversed);
        frame.add(msg);
        frame.add(lbl);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
}
