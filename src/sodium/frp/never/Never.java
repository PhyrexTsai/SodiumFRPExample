/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.never;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import nz.sodium.Cell;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SLabel;

/**
 *
 * @author yjtsai
 */
public class Never {
    public static void main(String[] args){
        Stream<String> never = new Stream<>();
        Cell<String> hello = new Cell<>("Hello"); 
        JFrame frame = Frame.draw().template();
        SLabel lbl = new SLabel(hello);
        frame.add(lbl);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
}
