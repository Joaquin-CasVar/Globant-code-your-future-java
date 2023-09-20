package Entities;

// @author Haze
import java.util.Scanner;

public class Persona {

    Scanner input = new Scanner(System.in);

    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        while (!getGenero().equalsIgnoreCase("M") && !getGenero().equalsIgnoreCase("H") && !getGenero().equalsIgnoreCase("O")) {
            System.out.println("Genero no valido.");
            System.out.println("Ingrese genero. (M/H/O)");
            genero = input.next();
            this.genero = genero;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
