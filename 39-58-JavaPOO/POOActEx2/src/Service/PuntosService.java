package Service;

// @author Haze
import Entity.Puntos;
import java.util.Scanner;

public class PuntosService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Puntos crearPuntos() {
        Puntos p = new Puntos();

        System.out.println("Ingrese x1");
        p.setX1(input.nextDouble());
        System.out.println("Ingrese y1");
        p.setY1(input.nextDouble());
        System.out.println("Ingrese x2");
        p.setX2(input.nextDouble());
        System.out.println("Ingrese y2");
        p.setY2(input.nextDouble());

        return p;
    }

    public double calcularDistanciaEntrePuntos(Puntos p) {
        return Math.sqrt(Math.pow(p.getX2() - p.getX1(), 2) + Math.pow(p.getY2() - p.getY1(), 2));
    }
}
