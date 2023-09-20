package herenciaact1;

// @author Haze
import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

public class HerenciaAct1 {

    public static void main(String[] args) {

        Animal p1 = new Perro("Stich", "Carne", 15, "Doberman");
        p1.alimentarse();

        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        p2.alimentarse();

        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        g1.alimentarse();

        Animal c1 = new Caballo("Spark", "Pasto", 25, "Fino");
        c1.alimentarse();

    }

}
