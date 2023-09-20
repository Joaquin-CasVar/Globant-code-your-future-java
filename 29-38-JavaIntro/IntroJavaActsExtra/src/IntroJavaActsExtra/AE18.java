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
public class AE18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int vec[] = new int[n];

        llenarVector(vec, n);
        mostrarVector(vec, n);
    }

    public static void llenarVector(int vector[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor Nº " + (i + 1));
            vector[i] = input.nextInt();
        }
    }

    public static void mostrarVector(int vector[], int n) {
        int acu = 0;
        for (int i = 0; i < n; i++) {
            acu += vector[i];
        }
        System.out.println("Suma de todos los elementos: " + acu);
    }
}
