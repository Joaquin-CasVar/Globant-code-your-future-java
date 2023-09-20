/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActsExtra;

/**
 *
 * @author Haze
 */
public class AE22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int mat[][] = new int[n][m];
        
        llenarMatriz(mat, n, m);
        sumarElementosMatriz(mat, n, m);
    }
    
    public static void llenarMatriz(int matriz[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void sumarElementosMatriz(int matriz[][], int n, int m) {
        int acu = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                acu += matriz[i][j];
            }
        }
        
        System.out.println("Suma de todos los elementos de la matriz: " + acu);
    }
}
