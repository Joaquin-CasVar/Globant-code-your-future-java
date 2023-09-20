package Entities;

// @author Haze
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor (en pulgadas)");
        resolucion = input.nextInt();
        System.out.println("Ingrese si el televisor tiene sintonizador");
        sintonizador = input.nextBoolean();
    }

    @Override
    public double precioFinal() {
        if (sintonizador) {
            if (resolucion > 40) {
                return (super.precioFinal() + 500) * 1.3;
            } else {
                return (super.precioFinal() + 500);
            }
        } else {
            if (resolucion > 40) {
                return super.precioFinal() * 1.3;
            } else {
                return super.precioFinal();
            }
        }
    }
}
