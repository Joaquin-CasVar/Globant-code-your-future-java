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

public class Act03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String cad = input.nextLine();
        
        cad = cad.toUpperCase();
        System.out.println(cad);
        cad = cad.toLowerCase();
        System.out.println(cad);
    }
    
}
