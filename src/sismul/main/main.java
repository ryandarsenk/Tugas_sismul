/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.main;


import sismul.Frame.menuutama;
/**
 *
 * @author wildan
 */
public class main {
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }  
}
