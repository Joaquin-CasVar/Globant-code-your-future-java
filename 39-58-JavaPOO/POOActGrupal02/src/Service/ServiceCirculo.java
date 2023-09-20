package Service;

// @author Haze
import Entities.Circulo;
import java.util.Scanner;

public class ServiceCirculo {

    Scanner leer = new Scanner(System.in);

    public Circulo crearCirculo() {
        Circulo c = new Circulo();

        System.out.println("Ingrese el radio: ");
        c.setRadio(leer.nextDouble());

        return c;
    }

    public void area(Circulo c) {
        System.out.println("El area del circulo es " + Math.PI * (c.getRadio() * c.getRadio()));
    }

    public void perimetro(Circulo c) {
        System.out.println("El perimetro del circulo es " + Math.PI * 2 * c.getRadio());
    }
}
