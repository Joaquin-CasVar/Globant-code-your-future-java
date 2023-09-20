package Service;

// @author Haze
import Entity.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PersonaService {

    Scanner input = new Scanner(System.in);
    Date fechaActual = new Date();
    Calendar fechaCalendario = new GregorianCalendar();

    public Persona crearPersona() {
        Persona p = new Persona();

        Calendar calendario = new GregorianCalendar();

        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(input.nextLine());
        System.out.println("Ingrese la fecha de nacimento de la persona");
        int dia, mes, anio;
        System.out.println("Ingrese el dia");
        dia = input.nextInt();
        System.out.println("Ingrese el mes");
        mes = input.nextInt();
        System.out.println("Ingrese el año");
        anio = input.nextInt();
        calendario.set(anio, mes, dia);
        p.setFechaNacimiento(calendario.getTime());

        return p;
    }

//    volver a hacer con un calculo que tome en cuenta el dia y mes
    public int calcularEdad(Persona p) {
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(p.getFechaNacimiento());
        int edad = (fechaCalendario.get(Calendar.YEAR) - calendario.get(Calendar.YEAR));

        System.out.println("Edad: " + edad);
        return edad;
    }

    public boolean menorQue(Persona p) {
        boolean flag = false;
        System.out.println("Ingrese una edad para comparar a la persona creada");
        int edad = input.nextInt();
        if (edad > calcularEdad(p)) {
            flag = true;
        }

        System.out.println(flag);
        return flag;
    }

    public void mostrarPersona(Persona p) {
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(p.getFechaNacimiento());
        int dia = calendario.get(Calendar.DATE);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);

        System.out.println("Persona");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
    }
}
