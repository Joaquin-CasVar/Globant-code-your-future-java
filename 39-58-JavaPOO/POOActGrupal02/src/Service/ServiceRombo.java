package Service;

// @author Haze
import Entities.Rombo;
import java.util.Scanner;

public class ServiceRombo {

    Scanner input = new Scanner(System.in);

    public Rombo crearRombo() {
        Rombo r = new Rombo();

        System.out.println("Ingrese el tamaño del lado: ");
        r.setLado(input.nextDouble());
        System.out.println("Ingrese el tamaño de la diagonal principal");
        r.setD1(input.nextDouble());
        System.out.println("Ingrese el tamaño de la diagonal secundaria");
        r.setD2(input.nextDouble());
        return r;
    }

    public void area(Rombo r) {
        System.out.println("El area del rombo es " + r.getD1() * r.getD2() / 2);
    }

    public void perimetro(Rombo r) {
        System.out.println("El perimetro del rombo es " + r.getLado() * 4);
    }
}
