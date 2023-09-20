package Entities;

// @author Haze
public abstract class Barco {

    protected String matricula;
    protected double metrosEslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double metrosEslora, int anioFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(double metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        return metrosEslora * 10;
    }
}
