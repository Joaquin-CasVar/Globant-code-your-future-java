package Entities;

// @author Haze
import java.util.List;

public class Cine {

    private Pelicula pelicula;
    private List<Espectador> espectadores;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, List<Espectador> espectadores, double precioEntrada) {
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

}
