package Service;

// @author Haze
import Entities.Cine;
import Entities.Espectador;
import Entities.Pelicula;

public class CineService {

    boolean[][] sala = new boolean[8][6];

    public void ubicarEspectadores(Cine cine) {
        int aux, aux1, aux2;
        Pelicula p = cine.getPelicula();
        for (Espectador espectador : cine.getEspectadores()) {
            if (espectador.getEdad() >= p.getEdadMinima() && espectador.getDinero() >= cine.getPrecioEntrada()) {
                aux = 0;
                do {
                    aux1 = (int) (Math.random() * 8);
                    aux2 = (int) (Math.random() * 6);
                    aux++;
                } while (sala[aux1][aux2] && aux < 1000);
                sala[aux1][aux2] = true;
            }
        }
    }

    public void mostrarSala() {
        System.out.println(" |A|B|C|D|E|F");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (j == 0) {
                    System.out.print(sala.length - i);
                    System.out.print("|");
                    if (sala[i][j]) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("|");
                    if (sala[i][j]) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
