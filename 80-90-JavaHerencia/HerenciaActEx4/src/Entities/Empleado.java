package Entities;

// @author Haze
import java.time.Year;
import java.util.Scanner;

public class Empleado extends Persona {

    protected Year anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(Year anioIncorporacion, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Year getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Year anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void reasignarDespacho() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el nuevo numero de despacho");
        numDespacho = input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ". Año de Incorporacion: " + anioIncorporacion + ", Despacho Nº" + numDespacho;
    }
    
}
