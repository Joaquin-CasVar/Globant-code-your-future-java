/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJavaActs;

import java.util.Scanner;

/**
 *
 * @author Haze
 */
public class Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = input.nextInt();
        System.out.println("Ingrese la moneda a convertir");
        String moneda = input.next();
        
        conversionEuro(euros, moneda);
    }

    public static void conversionEuro(int cant, String mon) {
        switch (mon) {
            case "libras":
                System.out.println(cant + " euros son " + cant * .86 + " libras");
                break;
            case "dolares":
                System.out.println(cant + " euros son " + cant * 1.28611 + " dolares");
                break;
            case "yenes":
                System.out.println(cant + " euros son " + cant * 129.852 + " yenes");
                break;
            default:
                System.out.println("Moneda no valida");
        }
    }

}
