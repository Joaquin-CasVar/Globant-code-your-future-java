package Entities;

// @author Haze
public class Cafetera {

    private int capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadActual) {
        this.capacidadMaxima = 100;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    
}
