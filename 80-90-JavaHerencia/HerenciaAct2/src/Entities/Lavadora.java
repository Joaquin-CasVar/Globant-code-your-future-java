package Entities;

// @author Haze
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese carga en kg.");
        carga = input.nextInt();
    }

    @Override
    public double precioFinal() {
        if (carga > 30) {
            return super.precioFinal() + 500;
        } else {
            return super.precioFinal();
        }
    }
}
