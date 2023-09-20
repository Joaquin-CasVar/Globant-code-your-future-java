package Entities;

// @author Haze
public class Hotel4 extends Hotel {

    protected char gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroDeCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroDeCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

//    private char comprobarCategoriaGimnasio(char letra) {
//        if (letra == 'A' || letra == 'a' || letra == 'B' || letra == 'b') {
//            return letra;
//        } else {
//            return 'B';
//        }
//    }
//    
    @Override
    public double calcularPrecioHabitacion() {
        return super.calcularPrecioHabitacion() + (1 * super.getCantHabitaciones()) + (valorPorRestaurante()) + (valorPorGimnasio());
    }

    public double valorPorRestaurante() {
        double aux;
        if (capacidadRestaurante < 30) {
            aux = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            aux = 30;
        } else {
            aux = 50;
        }
        return aux;
    }

    public double valorPorGimnasio() {
        double aux;
        if (gimnasio == 'A' || gimnasio == 'a') {
            aux = 50;
        } else {
            aux = 30;
        }
        return aux;
    }
}
