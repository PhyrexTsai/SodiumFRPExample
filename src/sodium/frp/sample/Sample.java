/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.sample;

import javax.swing.JFrame;
import nz.sodium.Cell;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SLabel;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class Sample {
    public static void main(String[] args){
        JFrame frame = Frame.draw().template();
        STextField text = new STextField("12345");
        frame.add(text);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
}
