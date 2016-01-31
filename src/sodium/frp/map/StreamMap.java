/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.map;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SButton;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class StreamMap {
    public static void main(String[] args) {
        JFrame frame = Frame.draw().template();
        
        SButton clear = new SButton("Clear"); 
        Stream<String> sClearIt = clear.sClicked.map(u -> ""); 
        STextField text = new STextField(sClearIt, "Hello"); 
        
        frame.add(text);
        frame.add(clear);
        frame.setSize(400, 160);
        frame.setVisible(true); 
    }
}
