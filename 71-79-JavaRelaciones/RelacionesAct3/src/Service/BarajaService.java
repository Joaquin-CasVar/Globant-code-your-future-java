package Service;

// @author Haze
import Entites.Baraja;
import Entites.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaService {

    int posBaraja = 0;

    public Baraja crearBaraja() {
        List<Carta> cartas = new ArrayList(0);
        for (int i = 0; i < 10; i++) {
            if (i == 7 || i == 8) {
                cartas.add(new Carta(i + 4, "espada"));
                cartas.add(new Carta(i + 4, "basto"));
                cartas.add(new Carta(i + 4, "copa"));
                cartas.add(new Carta(i + 4, "oro"));
            } else {
                cartas.add(new Carta(i + 1, "espada"));
                cartas.add(new Carta(i + 1, "basto"));
                cartas.add(new Carta(i + 1, "copa"));
                cartas.add(new Carta(i + 1, "oro"));
            }
        }
        return new Baraja(cartas);
    }

    public void barajar(Baraja b) {
        Collections.shuffle(b.getCartas());
        posBaraja = 0;
    }

    public void siguienteCarta(Baraja b) {
        if (posBaraja < 40) {
            System.out.println(b.getCartas().get(posBaraja));
            posBaraja++;
        } else {
            System.out.println("No hay mas cartas");
        }
    }

    public void cartasDisponibles(Baraja b) {
        System.out.println("Cartas Restantes: " + (b.getCartas().size() - posBaraja));
    }

    public void darCartas(Baraja b, int cant) {
        int aux = posBaraja;
        if (cant + posBaraja <= 40) {
            for (int i = posBaraja; i < cant + aux; i++) {
                System.out.println(b.getCartas().get(posBaraja));
                posBaraja++;
            }
        } else {
            System.out.println("No hay cartas suficientes para dar");
        }

    }

    public void cartasMonton(Baraja b) {
        if (posBaraja == 0) {
            System.out.println("No se ha descartado ninguna carta aun");
        } else {
            System.out.println("Cartas descartadas:");
            for (int i = 0; i < posBaraja; i++) {
                System.out.println(b.getCartas().get(i));
            }
        }
    }

    public void mostrarBaraja(Baraja b) {
        System.out.println("Cartas en la baraja:");
        for (int i = posBaraja; i < b.getCartas().size(); i++) {
            System.out.println(b.getCartas().get(i));
        }
    }
}
