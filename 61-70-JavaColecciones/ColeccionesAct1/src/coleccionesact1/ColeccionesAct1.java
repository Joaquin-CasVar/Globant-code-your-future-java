package coleccionesact1;

// @author Haze

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesAct1 {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String res = "S";
        boolean flag = true;
        
        while (!res.equalsIgnoreCase("N")) {
            System.out.println("Ingrese una raza de perro");
            perros.add(input.next());
            System.out.println("Quiere guardar otro perro.(S/N)");
            res = (input.next());
        }
        System.out.println("Lista de perros cargada:");
        perros.forEach(aux -> System.out.println(aux));
        
        System.out.println("Ingrese una raza de perro a eliminar");
        res = (input.next());
        
        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(res)) {
                it.remove();
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No se encontro la raza ingresada");
        }
        System.out.println("Lista de perros actualizada:");
        perros.forEach(aux -> System.out.println(aux));
    }

}
