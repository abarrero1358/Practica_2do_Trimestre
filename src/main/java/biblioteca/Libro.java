package biblioteca;
/**
 * La clase libro representa un libro con información básica:
 * Título, autor y año de publicación
 * @author ANDRÉS FELIPE BARRERO BUSTOS
 *
 */


public class Libro {

    /**
     * Titulo del libro
     */
    private String titulo;
    /**
     * Nombre del autor del libro
     */
    private String autor;
    /**
     * Año de publicación del libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Método constructor con párametros
     * @param titulo Título del libro
     * @param autor Título del libro
     * @param anioPublicacion Año publicación del libro
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Devuelve el autor del libro
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Devuelve el año de publicacion del libro
     * @return año de publicación
     */

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
