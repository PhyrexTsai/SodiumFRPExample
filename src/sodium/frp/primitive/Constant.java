/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.primitive;

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
public class Constant {
    public Constant(){
        main(null);
    }
    
    public static void main(String[] args){
        // constant
        Cell<String> hello = new Cell<>("Hello"); 
        JFrame frame = Frame.draw().template();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        SLabel lbl = new SLabel(hello);
        frame.add(lbl);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
    
}
