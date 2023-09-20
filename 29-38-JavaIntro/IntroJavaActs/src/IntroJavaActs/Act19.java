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
public class Act19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int mat[][] = new int[n][n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 10) - 5;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[j][i] != (mat[i][j]) * -1) {
                    flag = false;
                }
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        if (flag) {
            System.out.println("Matriz Transpuesta");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[j][i] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

}
