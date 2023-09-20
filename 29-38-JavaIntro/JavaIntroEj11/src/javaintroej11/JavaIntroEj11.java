/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej11;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una secuancia de caracteres");
        String cad = input.nextLine();
        String ret = codeCad(cad);

        System.out.println(ret);
    }

    public static String codeCad(String cad) {
        String cadRes = "";
        String car;
        for (int i = 0; i < cad.length(); i++) {
            car = cad.substring(i, i + 1);
            car = car.toLowerCase();
            switch (car) {
                case "a":
                    car = "@";
                    break;
                case "e":
                    car = "#";
                    break;
                case "i":
                    car = "$";
                    break;
                case "o":
                    car = "%";
                    break;
                case "u":
                    car = "*";
                    break;
            }
            cadRes = cadRes.concat(car);
        }
        return cadRes;
    }

}
