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
public class Act05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int num = input.nextInt();
        System.out.println("Doble del numero: " + num * 2);
        System.out.println("Triple del numero: " + num * 3);
        System.out.println("Raiz cuadrada del numero: " + Math.sqrt(num));
    }

}
