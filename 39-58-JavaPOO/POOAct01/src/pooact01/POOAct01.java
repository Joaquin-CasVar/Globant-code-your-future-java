package pooact01;

// @author Haze

import Entidad.Libro;
import Service.LibroService;

public class POOAct01 {

    public static void main(String[] args) {
        LibroService ls = new LibroService();
        Libro l1 = ls.cargarLibro();
        ls.mostrarLibro(l1);
    }

}
