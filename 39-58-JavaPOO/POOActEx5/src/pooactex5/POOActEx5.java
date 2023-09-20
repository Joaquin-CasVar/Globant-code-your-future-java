package pooactex5;

// @author Haze

import java.util.Scanner;

public class POOActEx5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[9];
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
        String mesAdi = input.next();
        while (!mesSecreto.equals(mesAdi)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mesAdi = input.next();
        }
        
        System.out.println("¡Ha acertado!");
    }

}
