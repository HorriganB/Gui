/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horriganb.fungui;
import java.util.Random;



/**
 *
 * @author HorriganB
 */
public class Math{
    public Random a;
    public Random b;
    public String e;
    public int c;
    public int d;
    
    /**
     * calls calc() and prints out the class
     */
    public Math(){
        System.out.println("Parent class init");
        calc();
        
    }
    /**
     * finds to random numbers and turns them into a string
     */
    public void calc(){
        a = new Random();
        b = new Random();
        c = a.nextInt(100) + 1;
        d = b.nextInt(100) + 1;
        e = new String(c + " x " + d);
        System.out.print(e);
        
        
        
        
    }
    
}
