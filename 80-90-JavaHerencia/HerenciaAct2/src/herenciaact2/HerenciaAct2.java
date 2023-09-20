package herenciaact2;

// @author Haze
import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

public class HerenciaAct2 {

    public static void main(String[] args) {
//        Ejercicio 2
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        System.out.println("Precio lavadora = $" + lavadora.precioFinal());
//
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();
//        System.out.println("Precio televisor = $" + televisor.precioFinal());

//        Ejercicio 3
        ArrayList<Electrodomestico> Electrodomesticos = new ArrayList();
        Lavadora l1 = new Lavadora(15, 1000d, "Blanco", 'A', 85);
        Lavadora l2 = new Lavadora(35, 1000d, "Blanco", 'A', 85);
        Televisor t1 = new Televisor(25, true, 1000d, "Negro", 'A', 85);
        Televisor t2 = new Televisor(45, false, 1000d, "Negro", 'A', 85);
        Electrodomesticos.add(l1);
        Electrodomesticos.add(l2);
        Electrodomesticos.add(t1);
        Electrodomesticos.add(t2);

        double tot = 0;
        double totLav = 0;
        double totTel = 0;
        for (Electrodomestico aux : Electrodomesticos) {
            if (aux instanceof Lavadora) {
                totLav += aux.precioFinal();
            } else if (aux instanceof Televisor) {
                totTel += aux.precioFinal();
            }
            tot += aux.precioFinal();
        }

        System.out.println("Precio de todas las lavadoras: $" + totLav);
        System.out.println("Precio de todos los televisores: $" + totTel);
        System.out.println("Precio de todos los electrodomesticos: $" + tot);
    }

}
