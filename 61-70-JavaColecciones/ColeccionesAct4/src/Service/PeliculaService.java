package Service;

// @author Haze
import Entity.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        this.peliculas = new ArrayList<>();
    }

    public void crearPelicula() {
        String res = "S";

        while (!res.equalsIgnoreCase("N")) {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(input.next());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(input.next());
            System.out.println("Ingrese la duracion de la pelicula en horas");
            p.setDuracion(input.nextDouble());

            peliculas.add(p);
            System.out.println("Quiere ingresar otra pelicula. (S/N)");
            res = input.next();
        }
    }

    public void mostrarPeliculas() {
        peliculas.forEach(aux -> System.out.println(aux));
    }

    public void mostrarPeliculasDuracionMayorA1Hora() {
        peliculas.forEach(aux -> {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        });
    }

    public void mostrarPeliculasOrdenadasMayAMenDuracion() {
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDescendente);
        peliculas.forEach(aux -> System.out.println(aux));
    }

    public void mostrarPeliculasOrdenadasMenAMayDuracion() {
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAscendente);
        peliculas.forEach(aux -> System.out.println(aux));
    }

    public void mostrarPeliculasPorTituloAlfabeticamente() {
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAlfabeticamente);
        peliculas.forEach(aux -> System.out.println(aux));
    }

    public void mostrarPeliculasPorDirectorAlfabeticamente() {
        Collections.sort(peliculas, Comparadores.ordenarPorDirectorAlfabeticamente);
        peliculas.forEach(aux -> System.out.println(aux));
    }
}
