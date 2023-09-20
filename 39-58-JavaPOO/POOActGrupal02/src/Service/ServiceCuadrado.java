package Service;

// @author Haze
import Entities.Cuadrado;
import java.util.Scanner;

public class ServiceCuadrado {

    Scanner input = new Scanner(System.in);

    public Cuadrado crearCuadrado() {
        Cuadrado c = new Cuadrado();

        System.out.println("Ingrese el tamaño del lado: ");
        c.setLado(input.nextDouble());
        return c;
    }

    public void area(Cuadrado c) {
        System.out.println("El area del cuadrado es " + c.getLado() * c.getLado());
    }

    public void perimetro(Cuadrado c) {
        System.out.println("El perimetro del cuadrado es " + c.getLado() * 4);
    }
}
