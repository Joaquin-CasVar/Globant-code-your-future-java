package pooact06;

// @author Haze
import Entities.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

public class POOAct06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CafeteraService cs = new CafeteraService();
        Cafetera c1 = new Cafetera(0);

        int op;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Vaciar Cafetera");
            System.out.println("3. Servir Taza");
            System.out.println("4. Agregar Cafe");
            System.out.println("0. Salir");
            op = input.nextInt();

            switch (op) {
                case 1:
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    cs.vaciarCafetera(c1);
                    break;
                case 3:
                    System.out.println("Tamaño de la taza");
                    cs.servirTaza(c1, input.nextInt());
                    break;
                case 4:
                    System.out.println("Cantidad a agregar");
                    cs.agregarCafe(c1, input.nextInt());
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);

    }

}
