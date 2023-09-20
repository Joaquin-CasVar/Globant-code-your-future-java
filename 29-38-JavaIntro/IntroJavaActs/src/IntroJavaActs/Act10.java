/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActs;

import java.util.Scanner;

/**
 *
 * @author Haze
 */
public class Act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lim;
        int acu = 0;
        System.out.println("Ingrese un valor limite");
        lim = input.nextInt();

        do {
            System.out.println("Ingrese un valor");
            acu += input.nextInt();
        } while (acu <= lim);
    }

}
