package Service;

// @author Haze
import Entities.Persona;
import java.util.Scanner;

public class PersonaService {

    Scanner input = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();

        System.out.println("Ingrese nombre");
        p.setNombre(input.next());
        System.out.println("Ingrese edad");
        p.setEdad(input.nextInt());
        System.out.println("Ingrese genero. (M/H/O)");
        p.setGenero(input.next());
        System.out.println("Ingrese peso en kgs");
        p.setPeso(input.nextDouble());
        System.out.println("Ingrese altura en mts");
        p.setAltura(input.nextDouble());
        return p;
    }

    public int calcularIMC(Persona p) {
        int res = (int) (p.getPeso() / Math.pow(p.getAltura(), 2));

        if (res < 20) {
            return -1;
        } else if (res > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean mayEdad = false;
        if (p.getEdad() >= 18) {
            mayEdad = true;
        }

        return mayEdad;
    }

}
