package Entities;

// @author Haze
public class Hotel5 extends Hotel4 {

    private int cantSalasDeConferencia;
    private int cantSuites;
    private int cantLimousines;

    public Hotel5() {
    }

    public Hotel5(int cantSalasDeConferencia, int cantSuites, int cantLimousines, char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroDeCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroDeCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalasDeConferencia = cantSalasDeConferencia;
        this.cantSuites = cantSuites;
        this.cantLimousines = cantLimousines;
    }

    public int getCantSalasDeConferencia() {
        return cantSalasDeConferencia;
    }

    public void setCantSalasDeConferencia(int cantSalasDeConferencia) {
        this.cantSalasDeConferencia = cantSalasDeConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimousines() {
        return cantLimousines;
    }

    public void setCantLimousines(int cantLimousines) {
        this.cantLimousines = cantLimousines;
    }

    @Override
    public double calcularPrecioHabitacion() {
        return super.calcularPrecioHabitacion() + (valorPorLimousine());
    }

    public double valorPorLimousine() {
        return cantLimousines * 15;
    }
}
