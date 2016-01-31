/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.primitive;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import nz.sodium.Cell;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SButton;
import swidgets.SLabel;

/**
 *
 * @author yjtsai
 */
public class Hold {
    public Hold() {
        main(null);
    }
    
    public static void main(String[] args) {
        JFrame frame = Frame.draw().template();
        SButton red = new SButton("red");
        SButton green = new SButton("green");
        Stream<String> sRed = red.sClicked.map(u -> "red");
        Stream<String> sGreen = green.sClicked.map(u -> "green");
        Stream<String> sColor = sRed.orElse(sGreen);
        Cell<String> color = sColor.hold(""); 
        SLabel lbl = new SLabel(color);
        frame.add(red);
        frame.add(green);
        frame.add(lbl);
        frame.setSize(400, 160);
        frame.setVisible(true);
 } 
}
