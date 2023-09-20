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
public class AE23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 20;
        int m = 20;
        String mat[][] = new String[n][m];

        llenarMatriz(mat, n, m);
        mostratMatriz(mat, n, m);
    }

    public static void llenarMatriz(String matriz[][], int n, int m) {
        Scanner input = new Scanner(System.in);
        int aux, aux2;
        String cad, car;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = "";
            }
        }

        for (int k = 0; k < 5; k++) {

            do {
                System.out.println("Ingrese una palabra de 3 a 5 caracteres");
                cad = input.next();
            } while (cad.length() < 3 || cad.length() > 5);

//            i = (int) (Math.random() * 20);
            do {
                aux2 = (int) (Math.random() * 20);
            } while (aux2 > 20 - cad.length());
            aux = (int) (Math.random() * 20);
            for (int j = 0; j < cad.length(); j++) {
                car = cad.substring(j, j + 1);
                if (matriz[aux][j + aux2].isEmpty()) {
                    matriz[aux][j + aux2] = car;
                } else if (aux + 1 < 20 && matriz[aux + 1][j + aux2].isEmpty()) {
                    aux++;
                    matriz[aux + 1][j + aux2] = car;
                } else if (aux - 1 > 0 && matriz[aux - 1][j + aux2].isEmpty()) {
                    aux--;
                    matriz[aux][j + aux2] = car;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j].isEmpty()) {
                    aux = (int) (Math.random() * 10);
                    matriz[i][j] = String.valueOf(aux);
                }
            }
        }
    }

    public static void mostratMatriz(String matriz[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
