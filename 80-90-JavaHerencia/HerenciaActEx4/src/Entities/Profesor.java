package Entities;

// @author Haze
import java.time.Year;
import java.util.Scanner;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, Year anioIncorporacion, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambioDepartamento() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nuevo departamento del profesor");
        departamento = input.next();
    }

    @Override
    public String toString() {
        return super.toString() + ". Departamento: " + departamento;
    }

}
