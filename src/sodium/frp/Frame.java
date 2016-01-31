/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author yjtsai
 */
public class Frame {
    
    private static Frame frame = new Frame();
    
    public static Frame draw() {
        return frame;
    }
    
    public JFrame template() {
        JFrame jframe = new JFrame("template");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());
        
        return jframe;
    }
    
}
