package Service;

// @author Haze
import Entities.Triangulo;
import java.util.Scanner;

public class ServiceTriangulo {

    Scanner leer = new Scanner(System.in);

    public Triangulo crearTriangulo() {
        Triangulo c = new Triangulo();

        System.out.println("Ingrese el tamaño de la base: ");
        c.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        c.setAltura(leer.nextDouble());
        return c;
    }

    public void area(Triangulo c) {
        System.out.println("El area del triangulo es " + (c.getBase() * c.getAltura()) / 2);
    }

    public void perimetro(Triangulo c) {
        System.out.println("El perimetro del triangulo es " + (c.getBase() * 3));
    }
}
