package Service;

// @author Haze
import Entity.Rectangulo;
import java.util.Scanner;

public class RectanguloService {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();

        System.out.println("Ingrese la base: ");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        r.setAltura(leer.nextDouble());
        return r;
    }

    public void superfice(Rectangulo r) {
        System.out.println("La superfice del rectangulo es " + r.getBase() * r.getAltura());
    }

    public void perimetro(Rectangulo r) {
        System.out.println("El perimetro del rectangulo es " + (r.getBase() + r.getAltura()) * 2);
    }

    public void dibujarRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || i == r.getAltura() - 1 || j == 0 || j == r.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
