package Entities;

// @author Haze
public class Estudiante {

    private String nombre;
    private int id;
    private int[] notas;

    public Estudiante() {
        notas = new int[10];
    }

    public Estudiante(String nombre, int id, int[] notas) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new int[10];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

}
