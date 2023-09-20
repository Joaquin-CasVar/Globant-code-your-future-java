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
public class AE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese un numero");
        int n = input.nextInt();
        while (n > 0) {
            n /= 10;
            cont++;
        }
        System.out.println("Nº de digitos: " + cont);
    }
    
}
