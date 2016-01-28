/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horriganb.fungui;
import javax.swing.JFrame;

/**
 *
 * @author HorriganB
 */
public class HorriganBFunGUI {

    /** makes the gui visible, stops when it is closed, and puts everything into the gui
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wild");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Display());
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
