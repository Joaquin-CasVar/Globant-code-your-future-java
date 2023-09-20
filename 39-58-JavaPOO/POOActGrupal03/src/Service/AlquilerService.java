package Service;

// @author Haze
import Entity.Alquiler;
import Entity.Pelicula;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AlquilerService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Calendar calendario = new GregorianCalendar();

    public Alquiler crearAlquiler(Pelicula[] pelicula) {
        Alquiler a = new Alquiler();

        System.out.println("Ingrese la pelicula a alquilar (ID)");
        int i = input.nextInt();
        pelicula[i].setAlquilada(true);
        a.setPeliculaAlquilada(pelicula[i]);
        System.out.println("Ingrese la fecha de inicio del alquiler");
        a.setFechaInicio(ingresarFecha());
        System.out.println("Ingrese la fecha de final del alquiler");
        a.setFechaFin(ingresarFecha());
        System.out.println("Ingrese el precio de la pelicula");
        a.setPrecio(input.nextDouble());

        return a;
    }

    public void listarAlquileres(Alquiler[] alquileres) {
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler.toString());
        }
    }

    public boolean buscarAlquiler(Alquiler[] alquileres, Date fecha) {
        boolean flag = false;

        for (Alquiler alquiler : alquileres) {
            if (checkFechas(alquiler.getFechaInicio(), fecha)) {
                System.out.println(alquiler.toString());
                flag = true;
            }
        }
        return flag;
    }

    public double calcularIngreso(Alquiler a, Date fechaDevolucion) {
        double ingreso, interes = 1;

        while (a.getFechaFin().before(fechaDevolucion)) {
            interes += .1;
            calendario.setTime(a.getFechaFin());
            calendario.add(Calendar.DATE, 1);
            a.setFechaFin(calendario.getTime());
        }

        ingreso = a.getPrecio() * interes;

        System.out.println("El ingreso del alquiler es: " + ingreso);
        return ingreso;
    }

    public Date ingresarFecha() {
        int dia, mes, anio;
        System.out.println("Dia");
        dia = input.nextInt();
        System.out.println("Mes");
        mes = input.nextInt();
        System.out.println("Año");
        anio = input.nextInt();
        calendario.set(anio, mes, dia);

        return calendario.getTime();
    }

    public boolean checkFechas(Date f1, Date f2) {
        calendario.setTime(f1);
        int dia = calendario.get(Calendar.DATE);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);

        calendario.setTime(f2);
        return dia == calendario.get(Calendar.DATE)
                && mes == calendario.get(Calendar.MONTH)
                && anio == calendario.get(Calendar.YEAR);
    }

    public Alquiler[] agregarAlquiler(Alquiler[] alquileres, Pelicula[] pelicula) {
        int tam = alquileres.length + 1;
        Alquiler[] newAlquileres = new Alquiler[tam];
        System.arraycopy(alquileres, 0, newAlquileres, 0, alquileres.length);
        newAlquileres[tam - 1] = crearAlquiler(pelicula);
        
        return newAlquileres;
    }
}
