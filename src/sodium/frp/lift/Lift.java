/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp.lift;

import javax.swing.JFrame;
import nz.sodium.Cell;
import sodium.frp.Frame;
import swidgets.SLabel;
import swidgets.STextField;

/**
 *
 * @author yjtsai
 */
public class Lift {
    public static void main(String[] args) {
        JFrame frame = Frame.draw().template();
        STextField txtA = new STextField("5");
        STextField txtB = new STextField("10");
        Cell<Integer> a = txtA.text.map(t -> parseInt(t));
        Cell<Integer> b = txtB.text.map(t -> parseInt(t));
        Cell<Integer> sum = Cell.lift((a_, b_) -> a_ + b_, a, b);
        SLabel lblSum = new SLabel(sum.map(i -> Integer.toString(i)));
        frame.add(txtA);
        frame.add(txtB);
        frame.add(lblSum);
        frame.setSize(400, 160);
        frame.setVisible(true);
    }
    
    // avoid exception throw
    private static Integer parseInt(String t) {
        try {
            return Integer.parseInt(t);
        } catch (NumberFormatException e) {
            return 0;
        }
    } 
}
