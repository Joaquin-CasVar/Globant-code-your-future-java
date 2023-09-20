package herenciaactex2;

// @author Haze
import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;

public class HerenciaActEx2 {

    public static void main(String[] args) {
        ArrayList<Edificio> estructuras = new ArrayList();

        Edificio o1 = new EdificioDeOficinas(7, 5, 15, 15.5, 2.4, 13.2);
        estructuras.add(o1);
        Edificio o2 = new EdificioDeOficinas(4, 10, 8, 20.5, 2.2, 23.7);
        estructuras.add(o2);
        Edificio p1 = new Polideportivo("Poli 1", true, 25.2, 13.7, 20.8);
        estructuras.add(p1);
        Edificio p2 = new Polideportivo("Poli 2", false, 27.5, 17.2, 18.3);
        estructuras.add(p2);

        int tech = 0, abi = 0;
        for (Edificio aux : estructuras) {
            if (aux instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux).cantPersonas();
            } else if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTechado()) {
                    tech++;
                } else {
                    abi++;
                }
            }
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }

        System.out.println("Polideportivos techados: " + 1);
        System.out.println("Polideportivos abiertos: " + 1);
    }

}
