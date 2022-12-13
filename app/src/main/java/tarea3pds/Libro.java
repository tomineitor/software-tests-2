package tarea3pds;

public class Libro {

    String titulo;
    String autor;
    String fecha;
    String paginas;
    String editorial;
    String genero;
    String isbn;
    String estante;
    String estado;
    String descripcion;

    public Libro(String titulo, String autor, String fecha, String paginas, String editorial, String genero, String isbn, String estante, String estado, String descripcion){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.paginas = paginas;
        this.editorial = editorial;
        this.genero = genero;
        this.isbn = isbn;
        this.estante = estante;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public String toString() {
        return ("(Titulo) " + this.titulo + " | (Autor/es) " + this.autor + " | (fecha) " + this.fecha + " | (paginas) " + this.paginas + " | (editorial) " + this.editorial + 
        " | (genero) " + this.genero + " | (ISBN) " + this.isbn + " | (estante) " + this.estante + " | (estado) " + this.estado + " | (descripcion) " + this.descripcion);
    }
}
