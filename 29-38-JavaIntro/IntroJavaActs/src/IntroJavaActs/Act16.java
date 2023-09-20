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
public class Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pos = "";
        int cant = 0;
        int n = 20;
        int vec[] = new int[n];
        System.out.println("Ingrese un numero a buscar en el vector");
        int num = input.nextInt();

        for (int i = 0; i < n; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            if (vec[i] == num) {
                cant += 1;
                pos = pos.concat(i + 1 + " ");
            }
        }
        switch (cant) {
            case 0:
                System.out.println("El numero no esta en el vector");
                break;
            case 1:
                System.out.println("El numero esta en el vector, en la posicion " + pos);
                break;
            default:
                System.out.println("El numero esta repetido en el vector, en las posiciones " + pos);
        }
    }

}
