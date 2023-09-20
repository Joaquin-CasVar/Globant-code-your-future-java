package Service;

// @author Haze
import Entities.Jugador;
import Entities.Revolver;

public class JugadorService {

    RevolverService rs = new RevolverService();

    public Jugador crearJugador(int id) {
        Jugador jugador = new Jugador();
        jugador.setId(id);
        jugador.setNombre("Jugador " + id);
        jugador.setMojadx(false);
        return jugador;
    }
    
    public boolean disparo(Revolver r, Jugador j) {
        if (rs.mojar(r)) {
            j.setMojadx(true);
            return true;
        }
        rs.siguienteChorro(r);
        return false;
    }
}
