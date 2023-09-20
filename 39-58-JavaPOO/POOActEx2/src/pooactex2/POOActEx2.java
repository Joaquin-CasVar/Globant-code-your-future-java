package pooactex2;

// @author Haze
import Entity.Puntos;
import Service.PuntosService;

public class POOActEx2 {

    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Puntos p1 = ps.crearPuntos();
        
        System.out.println("Distancia entre los dos puntos cargados: " + ps.calcularDistanciaEntrePuntos(p1));
    }

}
