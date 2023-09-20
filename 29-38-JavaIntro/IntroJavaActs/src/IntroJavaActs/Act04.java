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

public class Act04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en grados Celsius");
        float tempC = input.nextFloat();
        
        float tempF = 32 + (9 * tempC / 5);
        System.out.print("Temperatura en Fahrenheit: ");
        System.out.println(tempF);
    }
    
}
