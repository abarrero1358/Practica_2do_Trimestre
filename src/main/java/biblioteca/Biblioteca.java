
package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca, la cual almacena una colección de libros.
 *
 * @author Andrés Felipe Barrero Bustos
 */
public class Biblioteca {

    /**
     * Lista de libros almacenados en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor sin parámetros que inicializa la lista de libros.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa la biblioteca con una lista de libros proporcionada.
     *
     * @param libros Lista de libros inicial a añadir a la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Añade un libro a la biblioteca.
     *
     * @param libro Libro a añadir.
     * @return {@code true} si el libro se añadió correctamente, {@code false} en caso contrario.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Borra un libro de la biblioteca.
     *
     * @param libro Libro a borrar.
     * @return {@code true} si el libro se borró correctamente, {@code false} en caso contrario.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros almacenados en la biblioteca.
     *
     * @return Lista de libros en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo Título del libro a buscar.
     * @return El libro encontrado o {@code null} si no existe.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este método ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     *
     * Busca un libro en la biblioteca por su autor.
     *
     * @param autor Nombre del autor.
     * @return Un libro del autor si se encuentra, {@code null} en caso contrario.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros escritos por un autor en la biblioteca.
     *
     * @param autor Nombre del autor cuyos libros se buscan.
     * @return Lista de libros del autor especificado. Si el autor no tiene libros en la biblioteca, retorna una lista vacía.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
