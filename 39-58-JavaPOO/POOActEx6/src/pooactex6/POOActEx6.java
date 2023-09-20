package pooactex6;

// @author Haze
import Entity.Ahorcado;
import Service.AhorcadoService;

public class POOActEx6 {

    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        
        as.juego(a1);
    }

}
