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
public class AE20 {

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
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrarVector(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
}
