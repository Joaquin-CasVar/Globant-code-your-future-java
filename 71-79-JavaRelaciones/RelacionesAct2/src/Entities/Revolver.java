package Entities;

// @author Haze
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        this.posicionActual = 1;
        this.posicionAgua = 0;
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Posicion Actual: " + posicionActual + ", Posicion Agua:" + posicionAgua;
    }

}
