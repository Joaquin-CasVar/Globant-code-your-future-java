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
public class AE16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        String nombres[] = new String[n];
        int edades[] = new int[n];

        llenarVectores(nombres, edades, n);
        mostrarVectores(nombres, edades, n);
    }
    
    public static void llenarVectores(String vector1[], int vector2[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona Nº " + (i + 1));
            vector1[i] = input.next();
            System.out.println("Ingrese la edad de la persona Nº " + (i + 1));
            vector2[i] = input.nextInt();
        }
    }

    public static void mostrarVectores(String vector1[], int vector2[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            if (vector2[i] < 18) {
                System.out.println(vector1[i] + " es menor de edad");
            } else {
                System.out.println(vector1[i] + " es mayor de edad");
            }
            
            System.out.println("Quiere seguir mostrando personas? (Si/No)");
            String res = input.next();
            if (res.equalsIgnoreCase("No")) {
                break;
            }
        }
    }
}
