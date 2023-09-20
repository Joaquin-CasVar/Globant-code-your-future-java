package Entities;

// @author Haze
public class BarcoAMotor extends Barco {

    private int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV, String matricula, double metrosEslora, int anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

}
