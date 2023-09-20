package Entities;

// @author Haze
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojadx;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojadx) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojadx = mojadx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojadx() {
        return mojadx;
    }

    public void setMojadx(boolean mojadx) {
        this.mojadx = mojadx;
    }

}
