package Service;

// @author Haze
import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        String res = "S";
        String nombre;
        ArrayList<Integer> notas = new ArrayList<>();

        while (!res.equalsIgnoreCase("N")) {
            notas.clear();
            System.out.println("Ingrese el nombre del alumno");
            nombre = input.next();
            System.out.println("Ingrese las notas del alumno");
            notas.add(input.nextInt());
            notas.add(input.nextInt());
            notas.add(input.nextInt());
            
            alumnos.add(new Alumno(nombre, notas));
            System.out.println("Quiere ingresar otro alumno. (S/N)");
            res = input.next();
        }
    }

    public double notaFinal() {
        double prom = 0;
        System.out.println("Ingrese el nombre del alumno a calcular nota final");
        String nombre = input.next();

        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : aux.getNotas()) {
                    prom += nota;
                }
                prom = prom / 3;
                break;
            }
        }
        
        return prom;
    }

}
