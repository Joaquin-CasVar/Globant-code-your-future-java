package pooact11;

// @author Haze
import java.util.Date;
import java.util.Scanner;

public class POOAct11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese el dia");
        dia = input.nextInt();
        System.out.println("Ingrese el mes");
        mes = input.nextInt();
        System.out.println("Ingrese el año");
        anio = input.nextInt();

        Date fecha = new Date(anio - 1900, mes, dia);
        Date fechaActual = new Date();

        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Años entre la fecha actual y la ingresada: "
                + Math.abs(fechaActual.getYear() - fecha.getYear()));
    }

}
