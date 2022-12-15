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

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setEstante(String estante) {
        this.estante = estante;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Con esto se puede printear el objeto Libro por consola
    public String toString() {
        return ("(Titulo) " + this.titulo + " | (Autor/es) " + this.autor + " | (fecha) " + this.fecha + " | (paginas) " + this.paginas + " | (editorial) " + this.editorial + 
        " | (genero) " + this.genero + " | (ISBN) " + this.isbn + " | (estante) " + this.estante + " | (estado) " + this.estado + " | (descripcion) " + this.descripcion);
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getFecha() {
        return fecha;
    }
    public String getPaginas() {
        return paginas;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getGenero() {
        return genero;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getEstante() {
        return estante;
    }
    public String getEstado() {
        return estado;
    }
    public String getDescripcion() {
        return descripcion;
    }

}
