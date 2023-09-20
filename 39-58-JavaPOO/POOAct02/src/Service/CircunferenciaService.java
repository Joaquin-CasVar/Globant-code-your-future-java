package Service;

// @author Haze
import Entity.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    public Circunferencia crearCircunferencia() {
        Scanner input = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio");
        c1.setRadio(input.nextDouble());

        return c1;
    }

    public void area(Circunferencia c1) {
        double area = Math.PI * Math.pow(c1.getRadio(), 2);
        System.out.println("Area: " + area);
    }

    public void perimetro(Circunferencia c1) {
        double peri = 2 * Math.PI * c1.getRadio();
        System.out.println("Perimetro: " + peri);
    }

}
