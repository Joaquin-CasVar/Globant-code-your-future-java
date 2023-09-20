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
public class AE21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        double vec[] = new double[n];

        llenarVector(vec, n);
        calcularAprobados(vec, n);
    }

    public static void llenarVector(double vector[], int n) {
        double aux;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            System.out.println("Primer TP");
            aux = input.nextDouble() * .1;
            vector[i] += aux;
            System.out.println("Segundo TP");
            aux = input.nextDouble() * .15;
            vector[i] += aux;
            System.out.println("Primer Integrador");
            aux = input.nextDouble() * .25;
            vector[i] += aux;
            System.out.println("Segundo Integrador");
            aux = input.nextDouble() * .5;
            vector[i] += aux;
        }
    }

    public static void calcularAprobados(double vector[], int n) {
        int apro = 0, desap = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 7) {
                apro += 1;
            } else {
                desap += 1;
            }
        }

        System.out.println("Aprobados: " + apro);
        System.out.println("Desaprobados: " + desap);
    }
}
