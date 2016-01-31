/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.merge;

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
public class Merge {
    private static final String THANK_ZHTW = "謝謝";
    private static final String THANK_ENUS = "Thank you";
    
    public static void main(String[] args) {
        JFrame frame = Frame.draw().template();
        SButton thank_zh = new SButton(THANK_ZHTW);
        SButton thank_en = new SButton(THANK_ENUS);
        Stream<String> sThank_zhTW = thank_zh.sClicked.map(u ->
        THANK_ZHTW);
        Stream<String> sThank_enUS = thank_en.sClicked.map(u -> THANK_ENUS);
        Stream<String> sCanned = sThank_zhTW.orElse(sThank_enUS);
        STextField text = new STextField(sCanned, "");
        frame.add(text);
        frame.add(thank_zh);
        frame.add(thank_en);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
}
