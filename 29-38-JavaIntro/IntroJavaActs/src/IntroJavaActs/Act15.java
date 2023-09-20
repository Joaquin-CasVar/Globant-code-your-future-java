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
public class Act15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vec[] = new int[100];

        for (int i = 0; i < 100; i++) {
            vec[i] = i + 1;
        }
        for (int i = 100 - 1; i > 0 - 1; i--) {
            System.out.println(vec[i]);
        }
    }

}
