/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horriganb.fungui;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**Lays out the gui, locations for all the labels and buttons
 *and holds the scanner.
 * @author HorriganB
 */

public class Display extends JPanel implements ActionListener{
    private JButton print;
    private JLabel label;
    public Math a;
    public Scanner g;
    public Display(){
        
        
        print = new JButton("Math");
        label = new JLabel("Lets do Math");
   
        //lets
        setPreferredSize(new Dimension(500, 200));
        //Layout manager
        setLayout(null);
        add(print);
        add(label);
        print.setBounds(200,50,100,50);
        label.setBounds(20,70,200,100);
        print.addActionListener(this);
        
    }
    /**
     * Performs the action and calls all the methods and prints the multiplication 
     * @param e 
     */
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == print){
            a = new Guess();
            
            this.label.setText(a.e);
            calc();
            
        }
    }
    /**
     * Gets the guess and checks if it is right
     */
    public void calc(){
        g = new Scanner(System.in);
        System.out.println("What's your guess?");
        int z = g.nextInt();
        // Checks if the number guessed is right
        if((a.c * a.d) == z){
            label.setText("True");
            System.out.println("True");
        }
        else{
            label.setText("False");
            System.out.println("False");
        }
        
    }
    
}
