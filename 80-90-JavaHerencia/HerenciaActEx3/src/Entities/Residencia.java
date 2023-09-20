package Entities;

// @author Haze
public class Residencia extends AlojamientoExtrahotelero {

    private int cantHabitaciones;
    private boolean descuentoGremial;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentoGremial, boolean tieneCampoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremial = descuentoGremial;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremial() {
        return descuentoGremial;
    }

    public void setDescuentoGremial(boolean descuentoGremial) {
        this.descuentoGremial = descuentoGremial;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

}
