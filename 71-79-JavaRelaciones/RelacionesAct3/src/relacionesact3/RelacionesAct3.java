package relacionesact3;

// @author Haze
import Entites.Baraja;
import Service.BarajaService;
import java.util.Scanner;

public class RelacionesAct3 {

    public static void main(String[] args) {

        int op = -1;
        BarajaService bs = new BarajaService();
        Baraja b = bs.crearBaraja();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        while (op != 0) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Mezclar");
            System.out.println("2. Dar siguiente carta");
            System.out.println("3. Ver cantidad de cartas restante");
            System.out.println("4. Dar cartas");
            System.out.println("5. Ver cartas del monton");
            System.out.println("6. Ver cartas restantes");
            System.out.println("Ingrese opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    bs.barajar(b);
                    break;
                case 2:
                    bs.siguienteCarta(b);
                    break;
                case 3:
                    bs.cartasDisponibles(b);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cartas a dar");
                    bs.darCartas(b, input.nextInt());
                    break;
                case 5:
                    bs.cartasMonton(b);
                    break;
                case 6:
                    bs.mostrarBaraja(b);
                    break;
                default:
                    break;
            }
        }
    }

}
