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
public class AE13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int n = input.nextInt();
        int vec[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
