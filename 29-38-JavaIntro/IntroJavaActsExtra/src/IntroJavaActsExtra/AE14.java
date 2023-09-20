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
public class AE14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n = input.nextInt();
        System.out.println("Ingrese la cantidad de hijos");
        int m = input.nextInt();
        int mat[][] = new int[n][m];

        llenarMatriz(mat, n, m);
        calcularProm(mat, n, m);
    }

    public static void llenarMatriz(int matriz[][], int n, int m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Cargando datos familia Nº" + (i + 1));
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad del hijo Nº" + (j + 1));
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void calcularProm(int matriz[][], int n, int m) {
        int proms[] = new int[n];
        int acu = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                acu += matriz[i][j];
            }
            proms[i] = (acu / n);
            acu = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Promedio edad familia Nº" + (i + 1) + ": " + proms[i]);
        }
    }
}
