package Service;

import Entidad.Libro;
import java.util.Scanner;
// @author Haze
public class LibroService {
    
    public void mostrarLibro(Libro l) {
        System.out.println("ISBN: " + l.getIsbn());
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Nº de Paginas: " + l.getNumPags());
        
    }
    
    public Libro cargarLibro() {
        Scanner input = new Scanner(System.in);
        Libro l = new Libro();
        
        System.out.println("Ingrese el codigo ISBN");
        l.setIsbn(input.nextInt());
        System.out.println("Ingrese el Título");
        l.setTitulo(input.next());
        System.out.println("Ingrese el Autor");
        l.setAutor(input.next());
        System.out.println("Ingrese el Nº de Paginas");
        l.setNumPags(input.nextInt());
        return l;
    }
}
