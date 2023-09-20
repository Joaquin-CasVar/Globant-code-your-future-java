package Entity;

// @author Haze
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateValidator {

    public boolean checkFechaValida(String fecha) {
        int dia, mes, anio;
        boolean bisiesto = false;
        boolean fechaValida = false;
        dia = Integer.valueOf(fecha.substring(0, 2));
        mes = Integer.valueOf(fecha.substring(3, 5));
        anio = Integer.valueOf(fecha.substring(6, 10));

        if (anio % 4 == 0) {
            bisiesto = true;
        }

        if (mes <= 12) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia <= 31) {
                        System.out.println("Fecha valida");
                        fechaValida = true;
                    } else {
                        System.out.println("Dia invalido");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia <= 30) {
                        System.out.println("Fecha valida");
                        fechaValida = true;
                    } else {
                        System.out.println("Dia invalido");
                    }
                    break;
                case 2:
                    if (dia <= 28 && !bisiesto || dia <= 29 && bisiesto) {
                        System.out.println("Fecha valida");
                        fechaValida = true;
                    } else {
                        System.out.println("Dia invalido");
                    }
                    break;
                default:
                    System.out.println("Mes invalido");
            }
        }
        return fechaValida;
    }
}
