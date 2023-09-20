package Service;

// @author Haze
import Entity.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public CantanteFamoso crearCantante() {
        CantanteFamoso c = new CantanteFamoso();

        System.out.println("Ingrese el nombre del cantante");
        c.setNombre(input.next());
        System.out.println("Ingrese el nombre del disco con mas ventas del cantante");
        c.setDiscoConMasVentas(input.next());

        return c;
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes, String cantante) {
        boolean flag = false;

        for (CantanteFamoso aux : cantantes) {
            if (aux.getNombre().equals(cantante)) {
                cantantes.remove(aux);
                flag = true;
                break;
            }
        }

        if (flag) {
        } else {
            System.out.println("No se encontro el cantante ingresado");
        }
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantes) {
        cantantes.forEach(aux -> System.out.println(aux));
    }
}
