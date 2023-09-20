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
public class AE17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero para averiguar si es primo");
        int num = input.nextInt();

        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        int sqrtNum;

        sqrtNum = (int) Math.sqrt(num);
        for (int i = 1; i < num; i++) {
            if (i != 1) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        return primo;
    }

}
