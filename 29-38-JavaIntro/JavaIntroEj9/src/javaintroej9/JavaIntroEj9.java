/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej9;

/**
 *
 * @author Haze
 */
import java.util.Scanner;

public class JavaIntroEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int cont = 0;
        int acu = 0;

        do {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num > 0) {
                acu += num;
            } else if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            }
            cont += 1;
        } while (cont != 20);

        System.out.print("Total de los numeros ingresados: ");
        System.out.println(acu);
    }
}
