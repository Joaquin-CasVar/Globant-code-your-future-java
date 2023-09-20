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
public class AE07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a cargar");
        int n = input.nextInt();

        solucionDoWhile(n);
    }

    public static void solucionFor(int n) {
        Scanner input = new Scanner(System.in);
        int men = 0, may = 0, num, acu = 0, cont = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            num = input.nextInt();
            if (i == 0) {
                may = men = num;
            }
            if (num > 0) {
                acu += num;
                cont++;
            }
            if (num > may) {
                may = num;
            } else if (num < men) {
                men = num;
            }
        }
        System.out.println("Valor minimo: " + men);
        System.out.println("Valor maximo: " + may);
        System.out.println("Promedio n>0: " + (acu / cont));
    }

    public static void solucionWhile(int n) {
        Scanner input = new Scanner(System.in);
        int men = 0, may = 0, num, acu = 0, cont = 0, i = 0;
        while (i < n) {
            System.out.println("Ingrese el numero " + (i + 1));
            num = input.nextInt();
            if (i == 0) {
                may = men = num;
            }
            if (num > 0) {
                acu += num;
                cont++;
            }
            if (num > may) {
                may = num;
            } else if (num < men) {
                men = num;
            }
            i++;
        }
        System.out.println("Valor minimo: " + men);
        System.out.println("Valor maximo: " + may);
        System.out.println("Promedio n>0: " + (acu / cont));
    }

    public static void solucionDoWhile(int n) {
        Scanner input = new Scanner(System.in);
        int men = 0, may = 0, num, acu = 0, cont = 0, i = 0;
        do {
            System.out.println("Ingrese el numero " + (i + 1));
            num = input.nextInt();
            if (i == 0) {
                may = men = num;
            }
            if (num > 0) {
                acu += num;
                cont++;
            }
            if (num > may) {
                may = num;
            } else if (num < men) {
                men = num;
            }
            i++;
        } while (i < n);
        System.out.println("Valor minimo: " + men);
        System.out.println("Valor maximo: " + may);
        System.out.println("Promedio n>0: " + (acu / cont));
    }
}
