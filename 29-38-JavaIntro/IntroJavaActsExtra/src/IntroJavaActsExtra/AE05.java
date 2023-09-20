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
public class AE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tipo de socio");
        String tipo = input.next();
        System.out.println("Ingrese el costo del tratamiento");
        double monto = input.nextDouble();

        switch (tipo.toUpperCase()) {
            case "A":
                monto *= .5;
                break;
            case "B":
                monto *= .65;
                break;
            case "C":
                break;
            default:
                System.out.println("Tipo de socio inexistente.");
        }
        System.out.println("El monto a pagar es de $" + monto);
    }

}
