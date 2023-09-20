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
public class AE15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        double res;

        System.out.println("Ingrese 2 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elija opción > ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    res = sumar(num1, num2);
                    System.out.println("Resultado de la suma : " + res);
                    break;
                case 2:
                    res = restar(num1, num2);
                    System.out.println("Resultado de la resta : " + res);
                    break;
                case 3:
                    res = multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicacion : " + res);
                    break;
                case 4:
                    res = dividir(num1, num2);
                    System.out.println("Resultado de la division : " + res);
                    break;
            }
        } while (op != 0);
    }

    public static int sumar(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int restar(int num1, int num2) {
        int rest = num1 - num2;
        return rest;
    }

    public static int multiplicar(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static double dividir(int num1, int num2) {
        double div = num1 / num2;
        return div;
    }

}
