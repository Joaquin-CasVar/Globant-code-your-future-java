package Entities;

// @author Haze
public class Camping extends AlojamientoExtrahotelero {

    private int capacidadMaxDeCarpas;
    private int cantDeBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxDeCarpas, int cantDeBanios, boolean tieneRestaurante, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.capacidadMaxDeCarpas = capacidadMaxDeCarpas;
        this.cantDeBanios = cantDeBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaxDeCarpas() {
        return capacidadMaxDeCarpas;
    }

    public void setCapacidadMaxDeCarpas(int capacidadMaxDeCarpas) {
        this.capacidadMaxDeCarpas = capacidadMaxDeCarpas;
    }

    public int getCantDeBanios() {
        return cantDeBanios;
    }

    public void setCantDeBanios(int cantDeBanios) {
        this.cantDeBanios = cantDeBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

}
