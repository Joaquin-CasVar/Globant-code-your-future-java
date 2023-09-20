/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej8;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        int num = input.nextInt();
        
        while(num <= 0 || num >= 10) {
            System.out.println("Nota ingresada no valida. Ingrese otra");
            num = input.nextInt();
        }
    }

}
