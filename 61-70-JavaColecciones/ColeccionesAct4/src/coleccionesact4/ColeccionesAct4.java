package coleccionesact4;

// @author Haze

import Service.PeliculaService;
import java.util.Scanner;

public class ColeccionesAct4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        ps.crearPelicula();
        System.out.println("Peliculas sin Orden");
        ps.mostrarPeliculas();
        
        input.next();
        System.out.println("Peliculas duracion mayor a 1 hora");
        ps.mostrarPeliculasDuracionMayorA1Hora();
        
        input.next();
        System.out.println("Peliculas mayor a menor duracion");
        ps.mostrarPeliculasOrdenadasMayAMenDuracion();
        
        input.next();
        System.out.println("Peliculas menor a mayor duracion");
        ps.mostrarPeliculasOrdenadasMenAMayDuracion();
        
        input.next();
        System.out.println("Peliculas por Titulo");
        ps.mostrarPeliculasPorTituloAlfabeticamente();
        
        input.next();
        System.out.println("Peliculas por Director");
        ps.mostrarPeliculasPorDirectorAlfabeticamente();
    }

}
