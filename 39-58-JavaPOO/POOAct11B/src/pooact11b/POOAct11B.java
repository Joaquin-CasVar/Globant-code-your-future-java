package pooact11b;

// @author Haze
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class POOAct11B {

    public static void main(String[] args) {

        Calendar calendario = new GregorianCalendar();
        Calendar fechaActual = new GregorianCalendar();

        
        Scanner input = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese el dia");
        dia = input.nextInt();
        System.out.println("Ingrese el mes");
        mes = input.nextInt();
        System.out.println("Ingrese el año");
        anio = input.nextInt();

        calendario.set(anio, mes, dia);
        
        Date fecha = new Date();

        System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
        System.out.println("Años entre la fecha actual y la ingresada: " + Math.abs(fechaActual.get(Calendar.YEAR) - calendario.get(Calendar.YEAR)));
        
        
        calendario.setTime(fecha);

        String descripcion = calendario.toString();
        System.out.println(descripcion);

        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        anio = calendario.get(Calendar.YEAR);
        System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio);

        calendario.set(2014, 2, 15);
        System.out.println("La fecha es: " + calendario.get(Calendar.DATE)
                + "/" + calendario.get(Calendar.MONTH)
                + "/" + calendario.get(Calendar.YEAR));

        calendario.set(2017, 6, 9, 11, 30);
        System.out.println("La fecha es: " + calendario.get(Calendar.DATE)
                + "/" + calendario.get(Calendar.MONTH)
                + "/" + calendario.get(Calendar.YEAR)
                + " " + calendario.get(Calendar.HOUR)
                + ":" + calendario.get(Calendar.MINUTE));

        Date fechaDelCalendario = calendario.getTime();
        System.out.println(fechaDelCalendario);

    }

}
