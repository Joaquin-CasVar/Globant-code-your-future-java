package pooact04;

// @author Haze
import Entity.Rectangulo;
import Service.RectanguloService;

public class POOAct04 {

    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo r1 = rs.crearRectangulo();

        rs.superfice(r1);
        rs.perimetro(r1);
        rs.dibujarRectangulo(r1);
    }

}
