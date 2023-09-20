package Entities;

// @author Haze
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
        System.out.println("El polideportivo tiene una superficie de " + superficie + "m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = largo * ancho * alto;
        System.out.println("El polideportivo tiene un volumen de " + volumen + "m3");
    }

}
