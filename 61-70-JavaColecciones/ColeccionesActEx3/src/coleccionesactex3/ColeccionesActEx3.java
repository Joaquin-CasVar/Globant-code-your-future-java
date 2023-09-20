package coleccionesactex3;

// @author Haze
import Entity.Libro;
import Service.LibroService;
import java.util.HashSet;
import java.util.Scanner;

public class ColeccionesActEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        HashSet<Libro> libros = new HashSet();
        LibroService ls = new LibroService();
        String res;

        do {
            libros.add(ls.crearLibro());
            System.out.println("Quiere ingresar otro libro? (S/N)");
            res = input.next();
        } while (!res.equalsIgnoreCase("N"));

        System.out.println("Ingrese el titulo del libro a retirar");
        ls.prestamo(libros, input.next());

        System.out.println("Ingrese el titulo del libro a devolver");
        ls.devolucion(libros, input.next());
        
        libros.forEach(aux -> System.out.println(aux));
    }

}
