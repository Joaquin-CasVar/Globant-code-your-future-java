package Service;

// @author Haze
import Entities.Revolver;

public class RevolverService {

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionActual((int) (Math.floor(Math.random() * 6) + 1));
        r.setPosicionAgua((int) (Math.floor(Math.random() * 6) + 1));
        return r;
    }

    public boolean mojar(Revolver r) {
        return r.getPosicionActual() == r.getPosicionAgua();
    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() == 6) {
            r.setPosicionActual(1);
        } else {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
        
    }

}
