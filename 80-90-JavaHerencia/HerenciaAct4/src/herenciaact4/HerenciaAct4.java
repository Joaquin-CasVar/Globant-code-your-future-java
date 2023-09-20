package herenciaact4;

// @author Haze

import Entities.Circulo;
import Entities.Rectangulo;

public class HerenciaAct4 {

    public static void main(String[] args) {
        Circulo c = new Circulo(3, 6);
        System.out.println("Area del circulo: " + c.calcularArea());
        System.out.println("Perimetro del circulo: " + c.calcularPerimetro());
        
        Rectangulo r = new Rectangulo(2, 4);
        System.out.println("Area del rectangulo: " + r.calcularArea());
        System.out.println("Perimetro del rectangulo: " + r.calcularPerimetro());
    }

}
