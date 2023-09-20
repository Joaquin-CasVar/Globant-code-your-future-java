package Entities;

// @author Haze
import java.util.Scanner;

public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String Curso, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = Curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String Curso) {
        this.curso = Curso;
    }

    public void matricularCurso() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nombre del nuevo curso");
        curso = input.next();
    }

    @Override
    public String toString() {
        return super.toString() + ". Curso: " + curso;
    }

}
