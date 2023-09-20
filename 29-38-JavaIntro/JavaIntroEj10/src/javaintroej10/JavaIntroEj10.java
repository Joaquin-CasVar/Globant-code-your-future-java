/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej10;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            num1 = input.nextInt();
        } while (num1 <= 0 || num1 >= 20);
        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            num2 = input.nextInt();
        } while (num2 <= 0 || num2 >= 20);
        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            num3 = input.nextInt();
        } while (num3 <= 0 || num3 >= 20);
        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            num4 = input.nextInt();
        } while (num4 <= 0 || num4 >= 20);

        System.out.print(num1);
        System.out.print(" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num2);
        System.out.print(" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3);
        System.out.print(" ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4);
        System.out.print(" ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
