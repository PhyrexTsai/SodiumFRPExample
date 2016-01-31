/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodium.frp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yjtsai
 */
public class Sodium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Support primitives : 'CellMap', 'StreamMap', 'Constant', 'Filter', 'Hold', 'Merge', 'Never', 'Sample', 'Snapshot'.");
        System.out.println("Use 'quit' to quit.");
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
        } catch (ClassNotFoundException ex) {
            System.out.println("Something went wrong, please try again!");
        } catch (IOException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Something went wrong, please try again!");
        }
    }

}
