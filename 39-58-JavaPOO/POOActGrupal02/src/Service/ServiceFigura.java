package Service;

// @author Haze
import Entities.Circulo;
import Entities.Cuadrado;
import Entities.Hexagono;
import Entities.Pentagono;
import Entities.Rectangulo;
import Entities.Rombo;
import Entities.Triangulo;
import java.util.Scanner;

public class ServiceFigura {

    Scanner input = new Scanner(System.in);

    public void menu() {
        int op;
        do {
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Traingulo Equilatero");
            System.out.println("4. Circulo");
            System.out.println("5. Hexagono");
            System.out.println("6. Pentagono");
            System.out.println("7. Rombo");
            System.out.println("Ingrese la figura a calcular area y perimetro: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    ServiceCuadrado sc = new ServiceCuadrado();
                    Cuadrado c = sc.crearCuadrado();
                    sc.area(c);
                    sc.perimetro(c);
                    break;
                case 2:
                    ServiceRectangulo sr = new ServiceRectangulo();
                    Rectangulo r = sr.crearRectangulo();
                    sr.area(r);
                    sr.perimetro(r);
                    break;
                case 3:
                    ServiceTriangulo st = new ServiceTriangulo();
                    Triangulo t = st.crearTriangulo();
                    st.area(t);
                    st.perimetro(t);
                    break;
                case 4:
                    ServiceCirculo sci = new ServiceCirculo();
                    Circulo ci = sci.crearCirculo();
                    sci.area(ci);
                    sci.perimetro(ci);
                    break;
                case 5:
                    ServiceHexagono sh = new ServiceHexagono();
                    Hexagono h = sh.crearHexagono();
                    sh.area(h);
                    sh.perimetro(h);
                    break;
                case 6:
                    ServicePentagono sp = new ServicePentagono();
                    Pentagono p = sp.crearPentagono();
                    sp.area(p);
                    sp.perimetro(p);
                    break;
                case 7:
                    ServiceRombo sro = new ServiceRombo();
                    Rombo ro = sro.crearRombo();
                    sro.area(ro);
                    sro.perimetro(ro);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR. Figura no valida");
            }
        } while (op != 0);

    }

}
