package coleccionesactex2;

// @author Haze
import Entity.CantanteFamoso;
import Service.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesActEx2 {

    public static void main(String[] args) {
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        CantanteFamosoService cs = new CantanteFamosoService();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        for (int i = 0; i < 5; i++) {
            cantantes.add(cs.crearCantante());
        }
        
        cs.mostrarCantantes(cantantes);
        
        int op;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Cargar otro Cantante");
            System.out.println("2. Mostrar Lista de Cantantes");
            System.out.println("3. Eliminar Cantante");
            System.out.println("0. Salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    cantantes.add(cs.crearCantante());
                    break;
                case 2:
                    cs.mostrarCantantes(cantantes);
                    break;
                case 3:
                    System.out.println("Ingrese el Cantante a eliminar");
                    cs.eliminarCantante(cantantes, input.next());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingreso una opcion invalida");
            }
        } while (op != 0);
        
        System.out.println("Lista con todos los cambios realizados en el menu");
        cs.mostrarCantantes(cantantes);
    }

}
