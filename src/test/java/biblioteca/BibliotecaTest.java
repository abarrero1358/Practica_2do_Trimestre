package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {


    @Test
    public void agregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Caballero de la armadura oxidada", "Robert Fisher", 1987);
        /*Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro3 = new Libro("1984", "George Orwell", 1949);
        Libro libro4 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);*/

        boolean resultado = biblioteca.agregarLibro(libro);
        assertTrue(resultado);
        assertTrue(biblioteca.getLibros().contains(libro));

    }

    @Test
    void eliminarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Caballero de la armadura oxidada", "Robert Fisher", 1987);

        /**
         * Agrega Libro
         */
        biblioteca.agregarLibro(libro);

        /**
         * Eliminar Libro
         */
        boolean resultado = biblioteca.eliminarLibro(libro);
        /**
         * Verifica si se ha eliminado el libro
         */
        assertTrue(resultado);
        assertFalse(biblioteca.getLibros().contains(libro));
    }

    @Test
    void encuentraLibroPorTitulo() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Caballero de la armadura oxidada", "Robert Fisher", 1987);

        biblioteca.agregarLibro(libro);

    }

    @Test
    void encuentaLibroPorAutor() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Caballero de la armadura oxidada", "Robert Fisher", 1987);

        biblioteca.agregarLibro(libro);


    }

}