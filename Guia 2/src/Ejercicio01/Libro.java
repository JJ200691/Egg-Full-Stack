package Ejercicio01;

public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int cant_pag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int cant_pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cant_pag = cant_pag;
    }
}
