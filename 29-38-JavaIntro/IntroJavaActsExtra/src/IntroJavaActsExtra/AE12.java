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
public class AE12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1000;
        int vec[] = new int[n];

        llenarVector(vec, n);
        cambiar3xE(vec, n);
//        mostrarVector(vec, n);
    }
    
    public static void llenarVector(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = i;
        }
    }

    public static void mostrarVector(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void cambiar3xE(int vector[], int n) {
        for (int i = 0; i < n; i++) {
            String U = String.valueOf(vector[i] % 10);
            String D = String.valueOf(vector[i] / 10 % 10);
            String C = String.valueOf(vector[i] / 100);
            
            U = U.replace("3", "E");
            D = D.replace("3", "E");
            C = C.replace("3", "E");
            
            System.out.println(C + "-" + D + "-" + U);
        }
    }
}
