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
public class Act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10000;
        int vec[] = new int[n];
        int vecRes[] = new int[5];

        for (int i = 0; i < n; i++) {
            vec[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < n; i++) {
            if (vec[i] / 10000 > 0) {
                vecRes[4] += 1;
            } else if (vec[i] / 1000 > 0) {
                vecRes[3] += 1;
            } else if (vec[i] / 100 > 0) {
                vecRes[2] += 1;
            } else if (vec[i] / 10 > 0) {
                vecRes[1] += 1;
            } else {
                vecRes[0] += 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad de numeros de " + (i + 1) + " digitos es: " + vecRes[i]);
        }
    }

}
