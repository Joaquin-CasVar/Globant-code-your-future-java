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
public class Act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
