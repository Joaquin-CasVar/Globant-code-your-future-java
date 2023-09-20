package Entities;

// @author Haze

import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F' || letra >= 'a' && letra <= 'f') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        precio = 1000d;
        System.out.println("Ingrese el color del electrodomestico");
        color = comprobarColor(input.next());
        System.out.println("Ingrese la letra de consumo energetico del electrodomestico");
        consumoEnergetico = comprobarConsumoEnergetico(input.next().charAt(0));
        System.out.println("Ingrese el peso en kg. del electrodomestico");
        peso = input.nextInt();

    }

    public double precioFinal() {
        return precio + precioPorPeso() + precioPorConsumoEnergetico();
    }

    private double precioPorPeso() {
        if (peso > 80) {
            return 1000;
        } else if (peso > 49) {
            return 800;
        } else if (peso > 19) {
            return 500;
        } else {
            return 100;
        }
    }

    private double precioPorConsumoEnergetico() {
        switch (consumoEnergetico) {
            case 'A':
            case 'a':
                return 1000;
            case 'B':
            case 'b':
                return 800;
            case 'C':
            case 'c':
                return 600;
            case 'D':
            case 'd':
                return 500;
            case 'E':
            case 'e':
                return 300;
            case 'F':
            case 'f':
                return 100;
            default:
                return 0;
        }
    }
}
