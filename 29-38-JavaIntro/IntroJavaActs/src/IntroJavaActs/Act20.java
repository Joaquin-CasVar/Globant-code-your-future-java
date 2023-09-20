/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActs;

import java.util.Scanner;

/**
 *
 * @author Haze
 */
public class Act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int mat[][] = new int[n][n];
        boolean flag;
        
        llenarMatriz(mat, n, n);
        flag = checkMatrizMagica(mat, n, n);
        
        if (flag) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
    }
    
    public static void llenarMatriz(int matriz[][], int n, int m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                do {
                    System.out.print("Ingrese el valor del elemento [ " + i + "," + j + " ] ");
                    matriz[i][j] = input.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
    }
    
    public static boolean checkMatrizMagica(int matriz[][], int n, int m) {
        boolean flag = false;
        int d1 = 0;
        int d2 = 0;
        int aux = 0;
        
        for (int i = 0; i < n; i++) {
            int f = 0;
            int c = 0;
            for (int j = 0; j < m; j++) {
                f += matriz[i][j];
                c += matriz[j][i];
                if (i == j) {
                    d1 += matriz[i][j];
                }
                if (i + j == n - 1) {
                    d2 += matriz[i][j];
                }
            }
            if (i == 0) {
                aux = f;
            }
            if (f != aux) {
                return flag;
            }
            if (c != aux) {
                return flag;
            }
        }
        
        if (d1 != aux || d2!= aux) {
            return flag;
        }
        flag = true;
        return flag;
    }
}
