package Service;

// @author Haze
import Entities.Juego;
import Entities.Jugador;
import Entities.Revolver;
import java.util.Iterator;
import java.util.List;

public class JuegoService {

    JugadorService js = new JugadorService();

    public void llenarJuego(List<Jugador> jugadores, Revolver r, Juego j) {
        j.setJugadores(jugadores);
        j.setRevolver(r);
    }

    public void ronda(Juego j) {

        Iterator<Jugador> it = j.getJugadores().iterator();
        while (it.hasNext()) {
            Jugador jugadorActual = it.next();
            System.out.println("Le toca al jugador " + jugadorActual.getNombre());

            if (js.disparo(j.getRevolver(), jugadorActual)) {
                System.out.println("BOOM :(");
                System.out.println("Jugador Eliminado: " + jugadorActual.getNombre());
                break;
            }

        }
    }
}
