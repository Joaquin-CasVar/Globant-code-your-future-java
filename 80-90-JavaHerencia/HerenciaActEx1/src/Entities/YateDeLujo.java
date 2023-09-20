package Entities;

// @author Haze
public class YateDeLujo extends Barco {

    private int potenciaCV;
    private int numCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int potenciaCV, int numCamarotes, String matricula, double metrosEslora, int anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }

}
