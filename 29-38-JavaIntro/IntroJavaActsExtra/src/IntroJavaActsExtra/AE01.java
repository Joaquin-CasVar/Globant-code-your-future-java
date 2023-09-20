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
public class AE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias, horas;
        
        System.out.println("Ingrese tiempo en minutos");
        int mins = input.nextInt();
        
        dias = mins / 1440;
        mins = mins % 1440;
        horas = mins / 60;
        
        System.out.println(dias + " dias, " + horas + " horas.");
    }

}
