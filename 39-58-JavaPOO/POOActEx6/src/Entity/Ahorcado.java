package Entity;

// @author Haze
public class Ahorcado {

    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
        this.letrasEncontradas = 0;
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadasMax) {
        this.palabra = palabra;
        this.letrasEncontradas = 0;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

}
