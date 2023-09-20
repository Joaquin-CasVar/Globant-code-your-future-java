package Entities;

// @author Haze
public class Velero extends Barco {

    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, double metrosEslora, int anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }

}
