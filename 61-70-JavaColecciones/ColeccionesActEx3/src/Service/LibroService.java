package Service;

// @author Haze
import Entity.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Libro crearLibro() {
        Libro l = new Libro();

        System.out.println("Ingrese el titulo del libro");
        l.setTitulo(input.next());
        System.out.println("Ingrese al autor del libro");
        l.setAutor(input.next());
        System.out.println("Ingrese la cantidad de ejemplares del libro");
        l.setEjemplares(input.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados del libro");
        l.setEjemplaresPrestados(input.nextInt());

        return l;
    }

    public void prestamo(HashSet<Libro> libros, String libro) {
        boolean flag = false;

        for (Libro aux : libros) {
            if (aux.getTitulo().equals(libro)) {
                if (aux.getEjemplares() > aux.getEjemplaresPrestados()) {
                    aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
                } else {
                    System.out.println("No quedan ejemplares para prestar");
                }
                flag = true;
                break;
            }
        }

        if (flag) {
        } else {
            System.out.println("No existe el libro solicitado");
        }
    }

    public void devolucion(HashSet<Libro> libros, String libro) {
        boolean flag = false;

        for (Libro aux : libros) {
            if (aux.getTitulo().equals(libro)) {
                if (aux.getEjemplaresPrestados() != 0) {
                    aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() - 1);
                } else {
                    System.out.println("No hay ejemplares prestados");
                }
                flag = true;
                break;
            }
        }

        if (flag) {
        } else {
            System.out.println("No existe el libro solicitado");
        }
    }
}
