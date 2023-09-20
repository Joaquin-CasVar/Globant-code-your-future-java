package Entities;

// @author Haze
public class EdificioDeOficinas extends Edificio {

    private int oficinasPorPiso;
    private int personasPorOficina;
    private int cantDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinasPorPiso, int personasPorOficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinasPorPiso = oficinasPorPiso;
        this.personasPorOficina = personasPorOficina;
        this.cantDePisos = numeroDePisos;
    }

    public int getOficinasPorPiso() {
        return oficinasPorPiso;
    }

    public void setOficinasPorPiso(int oficinasPorPiso) {
        this.oficinasPorPiso = oficinasPorPiso;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroDePisos() {
        return cantDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.cantDePisos = numeroDePisos;
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho * cantDePisos;
        System.out.println("El edificio de oficinas tiene una superficie de " + superficie + "m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = largo * ancho * alto * cantDePisos;
        System.out.println("El edificio de oficinas tiene un volumen de " + volumen + "m3");
    }

    public void cantPersonas() {
        int personasPorPiso = personasPorOficina * oficinasPorPiso;
        int personasTotal = personasPorOficina * oficinasPorPiso * cantDePisos;
        System.out.println("Entran " + personasPorPiso + " personas en un piso");
        System.out.println("Entran " + personasTotal + " personas en el edificio");
    }

}
