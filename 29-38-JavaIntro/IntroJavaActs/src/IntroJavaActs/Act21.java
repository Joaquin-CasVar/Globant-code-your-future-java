/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActs;

/**
 *
 * @author Haze
 */
public class Act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10;
        int mat1[][] = new int[n1][n1];
        int n2 = 3;
        int mat2[][] = new int[n2][n2];
        llenarMatriz(mat1, n1, n1);
        llenarMatriz(mat2, n2, n2);
        mostrarMatriz(mat1, n1, n1);
        mostrarMatriz(mat2, n2, n2);

        checkMatEnMat(mat1, mat2, n1, n1, n2, n2);
    }

    public static void llenarMatriz(int matriz[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                matriz[i][j] = i+j;
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void mostrarMatriz(int matriz[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void checkMatEnMat(int matriz1[][], int matriz2[][], int n1, int m1, int n2, int m2) {
        boolean flag = true;
        for (int i = 0; i < n1 + 1 - n2; i++) {
            for (int j = 0; j < m1 + 1 - m2; j++) {
                if (matriz1[i][j] == matriz2[0][0]) {
                    for (int k = 0; k < n2; k++) {
                        for (int l = 0; l < m2; l++) {
                            if (!(matriz1[i + k][j + l] == matriz2[k][l])) {
                                k = n2;
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("La submatriz comienza en los indices " + (i) + "," + (j));
                        i = n1;
                        break;
                    }
                    flag = true;
                }
            }
        }
    }
}
