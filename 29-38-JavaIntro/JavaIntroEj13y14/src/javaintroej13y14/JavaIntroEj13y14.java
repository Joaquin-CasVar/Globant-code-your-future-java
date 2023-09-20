/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej13y14;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] equipo = new String [9];
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingresa el nombre de uno de tus compañeros");
            equipo[i] = input.nextLine();
        }
    }
    
}
