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
public class AE08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int par = 0, impar = 0, cont = 0;
        System.out.println("Ingrese un numero");
        int n = input.nextInt();

        while (n % 5 != 0) {
            if (n > 0) {
                cont++;
                if (n % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            System.out.println("Ingrese otro numero");
            n = input.nextInt();
        }
        System.out.println("Numeros leidos n>0: " + cont);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }

}
