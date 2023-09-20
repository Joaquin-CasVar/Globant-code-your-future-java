/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActsExtra;

import java.util.Scanner;

/**
 *
 * @author Haze
 */
public class AE10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int res;
        int resC = a * b;
        
        do {
            System.out.println("Intente adivinar el numero");
            res = input.nextInt();
            System.out.println(resC);
            if (res == resC) {
                System.out.println("Adivino el numero. Felicidades");
                break;
            } else {
                System.out.println("Numero incorrecto. Intente de nuevo");
            }
        } while (res != resC);
        
    }

}
