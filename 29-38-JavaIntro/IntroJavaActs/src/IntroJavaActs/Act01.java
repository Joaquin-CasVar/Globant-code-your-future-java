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
import java.util.Scanner;

public class Act01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        System.out.println(sum);
    }

}
