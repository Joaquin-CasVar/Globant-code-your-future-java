package Entity;

// @author Haze
import java.util.Date;

public class Alquiler {

    private Pelicula peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula peliculaAlquilada, Date fechaInicio, Date fechaFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Pelicula getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(Pelicula peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula Alquilada: " + peliculaAlquilada + ", Fecha de Inicio: " + fechaInicio + ", Fecha de Fin: " + fechaFin + ", Precio: " + precio + '}';
    }

}
