package Service;

// @author Haze
import Entity.Curso;
import java.util.Scanner;

public class CursoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = input.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        Curso c = new Curso();

        System.out.println("Ingrese el nombre del curso");
        c.setNombreCurso(input.nextLine());
        System.out.println("Ingrese la cantidad de horas por día");
        c.setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese el turno (mañana/tarde)");
        c.setTurno(input.nextLine());
        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(input.nextDouble());
        input.nextLine();
        c.setAlumnos(cargarAlumnos());

        return c;
    }

    public void calcularGananciaSemanal(Curso c) {
        double gSem;

        gSem = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5 * c.getCantidadDiasPorSemana();

        System.out.println("La ganancia semanal del curso es de: " + gSem);
    }
}
