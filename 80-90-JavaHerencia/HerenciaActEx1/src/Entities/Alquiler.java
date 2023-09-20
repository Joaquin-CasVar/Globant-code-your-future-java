package Entities;

// @author Haze
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {

    private String nombre;
    private int DNI;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double cotizar() {
        long diasAlquilado = DAYS.between(fechaAlquiler, fechaDevolucion);
        return diasAlquilado * barco.calcularModulo();
    }
}
