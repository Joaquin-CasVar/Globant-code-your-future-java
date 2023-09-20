package Entidad;

// @author Haze
public class Libro {

//    Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int numPags;

//    Constructor por defecto
    public Libro() {
    }

//    Constructor por parametros
    public Libro(int isbn, String titulo, String autor, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }
//    Getters y Setters

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPags=" + numPags + '}';
    }

}
