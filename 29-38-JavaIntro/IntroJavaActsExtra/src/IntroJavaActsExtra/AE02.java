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
public class AE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        System.out.println("Valores Iniciales");
        System.out.println("A->" + a);
        System.out.println("B->" + b);
        System.out.println("C->" + c);
        System.out.println("D->" + d);
        
        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.println("Valores Finales");
        System.out.println("A->" + a);
        System.out.println("B->" + b);
        System.out.println("C->" + c);
        System.out.println("D->" + d);
    }
    
}
