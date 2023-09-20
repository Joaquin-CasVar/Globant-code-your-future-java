package Entities;

// @author Haze
public class ObjetoRadar {

    private boolean hostil;
    private int coordenadaX;
    private int coordenadaY;
    private int coordenadaZ;
    private int resistencia;

    public ObjetoRadar() {
    }

    public ObjetoRadar(boolean hostil, int coordenadaX, int coordenadaY, int coordenadaZ, int resistencia) {
        this.hostil = hostil;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.resistencia = resistencia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(int coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        if (hostil) {
            return "Objeto Detectado. " + "Hostil,\t(X,Y,Z): " + coordenadaX + ", " + coordenadaY + ", " + coordenadaZ + ", Resistencia: " + resistencia;
        } else {
            return "Objeto Detectado. " + "No Hostil,\t(X,Y,Z): " + coordenadaX + ", " + coordenadaY + ", " + coordenadaZ + ", Resistencia: " + resistencia;
        }

    }

}
