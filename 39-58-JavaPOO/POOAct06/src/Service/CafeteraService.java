package Service;

// @author Haze
import Entities.Cafetera;

public class CafeteraService {

    public void llenarCafetera(Cafetera c) {
        c.setCapacidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera c, int tam) {
        if (c.getCapacidadActual() < tam) {
            System.out.println("No se lleno la taza. Quedo " + c.getCapacidadActual() + "ml");
            c.setCapacidadActual(0);
        } else {
            System.out.println("Se lleno la taza");
            c.setCapacidadActual(c.getCapacidadActual() - tam);
        }

    }

    public void vaciarCafetera(Cafetera c) {
        c.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera c, int caf) {
        c.setCapacidadActual(c.getCapacidadActual() + caf);
    }
}
