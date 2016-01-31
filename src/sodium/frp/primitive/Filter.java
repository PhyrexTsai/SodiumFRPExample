/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.primitive;

import javax.swing.JFrame;
import nz.sodium.Cell;
import nz.sodium.Stream;
import sodium.frp.Frame;
import swidgets.SButton;
import swidgets.SLabel;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class Filter {
    public Filter() {
        main(null);
    }
    
    // 這邊是在做 stream 的 filter，當發生吻合事件的時候才會被處發
    public static void main(String[] args) {
        JFrame view = Frame.draw().template();
        STextField english = new STextField("12345");
        SButton match = new SButton("Change when all number");
        Stream<String> sLatin =
        match.sClicked
                .snapshot(english.text)
                .filter(u -> u.matches("^[0-9]*$"));
        Cell<String> latin = sLatin.hold("");
        SLabel lblLatin = new SLabel(latin);
        view.add(english);
        view.add(match);
        view.add(lblLatin);
        view.setSize(400, 160);
        view.setVisible(true);
    } 
}
