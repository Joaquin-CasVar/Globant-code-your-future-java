package Service;

// @author Haze
import Entities.Hexagono;
import java.util.Scanner;

public class ServiceHexagono {

    Scanner input = new Scanner(System.in);

    public Hexagono crearHexagono() {
        Hexagono h = new Hexagono();

        System.out.println("Ingrese el tamaño del lado: ");
        h.setLado(input.nextDouble());
        return h;
    }

    public void area(Hexagono h) {
        System.out.println("El area del hexagono es " + (3 * Math.sqrt(3) / 2) * Math.pow(h.getLado(), 2));
    }

    public void perimetro(Hexagono h) {
        System.out.println("El perimetro del hexagono es " + h.getLado() * 6);
    }

}
