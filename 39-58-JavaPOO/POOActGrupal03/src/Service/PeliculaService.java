package Service;

// @author Haze
import Entity.Pelicula;
import java.util.Scanner;

public class PeliculaService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        p.setTitulo(input.next());
        System.out.println("Ingrese el genero de la pelicula");
        p.setGenero(input.next());
        System.out.println("Ingrese el año de la pelicula");
        p.setAño(input.nextInt());
        System.out.println("Ingrese la duracion de la pelicula");
        p.setDuracion(input.nextInt());

        return p;
    }

    public void listarPeliculas(Pelicula[] peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void listarPeliculasAlquiladas(Pelicula[] peliculas) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isAlquilada()) {
            } else {
                System.out.println(pelicula.toString());
            }
            
        }
    }

    public boolean buscarPeliculaPorTitulo(Pelicula[] peliculas, String titulo) {
        boolean flag = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            System.out.println("La pelicula " + titulo + " existe");
        } else {
            System.out.println("La pelicula " + titulo + " no existe");
        }
        return flag;
    }

    public boolean buscarPeliculaPorGenero(Pelicula[] peliculas, String genero) {
        boolean flag = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            System.out.println("Una pelicula de " + genero + " existe");
        } else {
            System.out.println("Una pelicula de " + genero + " no existe");
        }
        return flag;
    }
    
    public Pelicula[] agregarAlquiler(Pelicula[] pelicula) {
        int tam = pelicula.length + 1;
        Pelicula[] newAlquileres = new Pelicula[tam];
        System.arraycopy(pelicula, 0, newAlquileres, 0, pelicula.length);
        newAlquileres[tam - 1] = crearPelicula();
        
        return newAlquileres;
    }
}
