package relacionesactex2;

// @author Haze
import Entities.Cine;
import Entities.Espectador;
import Entities.Pelicula;
import Service.CineService;
import java.util.ArrayList;

public class RelacionesActEx2 {

    public static void main(String[] args) {
        
        ArrayList<Espectador> espectadores = new ArrayList();
        Pelicula p = new Pelicula("Spiderman", 137, 13, "Sam Reimi");
        Cine c = new Cine();
        for (int i = 0; i < 48; i++) {
            espectadores.add(new Espectador("A", (int) (Math.random() * 45 + 1), Math.random() * 10));
        }
        c.setEspectadores(espectadores);
        c.setPelicula(p);
        c.setPrecioEntrada(4.55);
        
        CineService cs = new CineService();
        cs.ubicarEspectadores(c);
        cs.mostrarSala();
    }

}
