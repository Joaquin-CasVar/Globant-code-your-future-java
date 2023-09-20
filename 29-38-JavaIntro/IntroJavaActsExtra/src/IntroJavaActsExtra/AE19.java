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
public class AE19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        
        llenarVectores(vec1, vec2, n);
        compararVectores(vec1, vec2, n);
    }
    
    public static void llenarVectores(int vector1[], int vector2[], int n) {
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
//            vector2[i] = vector1[i];
        }
    }
    
    public static void compararVectores(int vector1[], int vector2[], int n) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores son diferentes");
                flag = false;
                break;
            }
//            System.out.print(vector1[i] + "=");
//            System.out.println(vector2[i]);
        }
        
        if (flag) {
            System.out.println("Los vectores son iguales");
        }
    }
}
