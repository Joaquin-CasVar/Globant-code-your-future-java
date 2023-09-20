package Service;

// @author Haze
import Entities.Rectangulo;
import java.util.Scanner;

public class ServiceRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo c = new Rectangulo();

        System.out.println("Ingrese el tamaño de la base: ");
        c.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        c.setAltura(leer.nextDouble());
        return c;
    }

    public void area(Rectangulo c) {
        System.out.println("El area del rectangulo es " + c.getBase() * c.getAltura());
    }

    public void perimetro(Rectangulo c) {
        System.out.println("El perimetro del rectangulo es " + (c.getBase() * 2 + c.getAltura() * 2));
    }
}
