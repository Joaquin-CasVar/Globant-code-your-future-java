package Service;

// @author Haze
import Entities.Pentagono;
import java.util.Scanner;

public class ServicePentagono {

    Scanner input = new Scanner(System.in);

    public Pentagono crearPentagono() {
        Pentagono p = new Pentagono();

        System.out.println("Ingrese el tamaño del lado: ");
        p.setLado(input.nextDouble());
        return p;
    }

    public void area(Pentagono p) {
        System.out.println("El area del pentagono es " + 0.25 * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(p.getLado(), 2));
    }

    public void perimetro(Pentagono p) {
        System.out.println("El perimetro del pentagono es " + p.getLado() * 5);
    }
}
