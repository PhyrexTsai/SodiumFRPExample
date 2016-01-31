/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.snapshot;

import java.awt.FlowLayout;
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
public class Snapshot {
    public static void main(String[] args) {
        JFrame view = Frame.draw().template();
        STextField english = new STextField("I like FRP");
        SButton translate = new SButton("Translate");
        Stream<String> sLatin =
        translate.sClicked.snapshot(english.text, (u, txt) ->
        txt.trim().replaceAll(" |$", "us ").trim()
        );
        Cell<String> latin = sLatin.hold("");
        SLabel lblLatin = new SLabel(latin);
        view.add(english);
        view.add(translate);
        view.add(lblLatin);
        view.setSize(400, 160);
        view.setVisible(true);
    } 
}
