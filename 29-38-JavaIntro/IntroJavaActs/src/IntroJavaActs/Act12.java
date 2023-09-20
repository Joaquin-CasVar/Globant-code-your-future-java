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
public class Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cad;
        int co = 0, inco = 0;

        do {
            System.out.println("Ingrese una cadena");
            cad = input.nextLine();
            if (cad.startsWith("X") && cad.endsWith("O") && cad.length() == 5) {
                co += 1;
            } else {
                if (!cad.equals("&&&&&")) {
                    inco += 1;
                } 
            }
        } while (!cad.equals("&&&&&"));

        System.out.println("Lecturas Correctas: " + co);
        System.out.println("Lecturas Incorrectas: " + inco);
    }

}
