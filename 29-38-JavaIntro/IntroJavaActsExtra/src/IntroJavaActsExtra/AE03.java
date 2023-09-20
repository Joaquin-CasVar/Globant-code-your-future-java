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
public class AE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String let = input.next();
        
        switch (let.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                break;
            default:
                System.out.println("La letra no es vocal");
        }
    }
    
}
