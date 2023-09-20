/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActsExtra;

/**
 *
 * @author Haze
 */
public class AE09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 50;
        int b = 10;
        int c = 0, r;
        
        while (a >= b) {
            a-= b;
            c++;
        }
        r = a;
        System.out.println("Cociente: " + c);
        System.out.println("Resto: " + r);
    }
    
}
