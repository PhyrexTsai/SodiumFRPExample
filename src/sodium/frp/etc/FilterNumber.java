/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.etc;

import javax.swing.JFrame;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SButton;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class FilterNumber {
    
    public static void main(String[] args){
        JFrame view = Frame.draw().template();
        STextField string = new STextField("12345");
        string.text.map((u) -> { System.out.println(u);  return "";});
        view.setVisible(true);
    }
    
}
