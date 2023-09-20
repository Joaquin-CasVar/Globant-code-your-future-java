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
public class AE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int altura, acu = 0;
        int alturaT160 = 0, cont160 = 0;
        System.out.println("Ingrese la cantidad de personas a analizar");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + "(en centimetros)");
            altura = input.nextInt();
            
            if (altura < 160) {
                alturaT160 += altura;
                cont160++;
            }
            acu += altura;
        }
        System.out.println("Promedio altura personas <160: " + alturaT160 / cont160);
        System.out.println("Promedio altura general: " + acu / n);
    }

}
