/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese 2 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (num1 > 25){
            System.out.println("El numero 1 es mayor a 25");
        } else if (num2 > 25){
            System.out.println("El numero 2 es mayor a 25");
        } else {
            System.out.println("Ningun numero es mayor a 25");
        }
        
    }
    
}
