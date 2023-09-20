package relacionesact2;

// @author Haze
import Entities.Juego;
import Entities.Jugador;
import Entities.Revolver;
import Service.JuegoService;
import Service.JugadorService;
import Service.RevolverService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelacionesAct2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        JuegoService js = new JuegoService();
        JugadorService jus = new JugadorService();
        RevolverService rs = new RevolverService();

        List<Jugador> jugadores = new ArrayList();
        Revolver r = rs.llenarRevolver();
        Juego j = new Juego();

        System.out.println("Ingrese la cantidad de jugadores (Entre 1 y 6)");
        int aux = input.nextInt();
        if (aux > 6 || aux < 1) {
            aux = 6;
        }
        for (int i = 0; i < aux; i++) {
            jugadores.add(jus.crearJugador(i + 1));
        }

        js.llenarJuego(jugadores, r, j);
        js.ronda(j);
    }

}
