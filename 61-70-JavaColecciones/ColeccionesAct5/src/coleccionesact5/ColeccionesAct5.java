package coleccionesact5;

// @author Haze

import Service.PaisService;
import java.util.Scanner;

public class ColeccionesAct5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        PaisService ps = new PaisService();
        ps.cargarPaises();
        ps.mostrarPaisesAlfabeticamente();
        System.out.println("Ingrese el pais que quiere eliminar de la lista");
        String pais = input.next();
        ps.eliminarPais(pais);
    }

}
