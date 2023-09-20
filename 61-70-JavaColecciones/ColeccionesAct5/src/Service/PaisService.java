package Service;

// @author Haze

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    HashSet<String> paises = new HashSet<>();
    
    public void cargarPaises() {
        String res = "S";
        while (!res.equalsIgnoreCase("N")) {
            System.out.println("Ingrese el pais");
            paises.add(input.next());

            System.out.println("Quiere ingresar otro pais. (S/N)");
            res = input.next();
        }
        System.out.println("Paises Cargados:");
        paises.forEach(aux -> System.out.println(aux));
    }
    
    public void mostrarPaisesAlfabeticamente() {
        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        System.out.println("Paises Ordenados Alfabeticamente:");
        paisesLista.forEach(aux -> System.out.println(aux));
    }
    
    public void eliminarPais(String pais) {
        boolean flag = false;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                flag = true;
                break;
            }
        }
        
        if (flag) {
            paises.forEach(aux -> System.out.println(aux));
        } else {
            System.out.println("No se encontro el pais ingresado");
        }
    }
}
