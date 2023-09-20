package Entities;

// @author Haze
import java.time.Year;
import java.util.Scanner;

public class PersonalServicio extends Empleado {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Year anioIncorporacion, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese la nueva seccion del personal de servicio");
        seccion = input.next();
    }

    @Override
    public String toString() {
        return super.toString() + ". Seccion: " + seccion;
    }
    
}
