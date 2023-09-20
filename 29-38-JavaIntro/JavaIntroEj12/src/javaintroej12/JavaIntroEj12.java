/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej12;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }

}
