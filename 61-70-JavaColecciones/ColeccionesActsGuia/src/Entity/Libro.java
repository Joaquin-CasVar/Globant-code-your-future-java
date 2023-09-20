package Entity;

// @author Haze
public class Libro {

    private String titulo;
    private int isbn;

    public Libro() {
    }

    public Libro(String titulo, int isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
}
