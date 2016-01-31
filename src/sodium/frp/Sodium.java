/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 *
 * @author yjtsai
 */
public class Sodium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type a FRP primitive to start : ");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = "";

            while (line.equalsIgnoreCase("quit") == false) {
                line = in.readLine();
                if (!line.trim().equals("") && !line.trim().equals("quit")) {
                    Class[] classes = {};
                    Class.forName("sodium.frp.primitive." + line).newInstance();
                }
            }

            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
