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
public class AE24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        int vec[] = new int[n];

        llenarVectorConNFibonacci(vec, n);
        mostrarVector(vec, n);
    }

    public static void llenarVectorConNFibonacci(int sucFibo[], int n) {
        int n1 = 1, n2 = 0;

        for (int i = 0; i < n; i++) {
            if (i > 1) {
                sucFibo[i] = n1 + n2;
                n2 = n1;
                n1 = sucFibo[i];
            } else {
                sucFibo[i] = n1 + n2;
            }
        }
    }
    
    public static void mostrarVector(int vector[], int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println("");
    }
}
