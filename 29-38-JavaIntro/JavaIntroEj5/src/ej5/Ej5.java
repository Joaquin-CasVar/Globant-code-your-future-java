/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
    
        System.out.println("Ingresa V o F");
        boolean flag = input.nextBoolean();
        
        System.out.println("Ingresa un numero real");
        double num = input.nextDouble();
        
        System.out.println("Ingresa un caracter");
        char car = input.next().charAt(0);   
    }
    
    public static void DetE(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
    }
}
