package Entities;

// @author Haze
public class Dispositivo {

    public boolean estado;
    private int consumoEnergetico;
    private boolean destruido;

    public Dispositivo() {
    }

    public Dispositivo(boolean estado, int consumoEnergetico) {
        this.estado = estado;
        this.consumoEnergetico = consumoEnergetico;
        this.destruido = false;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    @Override
    public String toString() {
        return "Funcional: " + estado + ", Consumo Energetico: " + consumoEnergetico + "kWh";
    }
    
}
