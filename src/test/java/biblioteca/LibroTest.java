package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Caballero de la armadura oxidada", "Robert Fisher", 1987);
    }

    @Test
    void getTitulo() {
        assertEquals("Caballero de la armadura oxidada", libro.getTitulo());
    }

    @Test
    void setTitulo() {
        libro.setTitulo("Caballero de la armadura oxidada");
        assertEquals("Caballero de la armadura oxidada", libro.getTitulo());
    }

    @Test
    void getAutor() {
        assertEquals("Robert Fisher", libro.getAutor());
    }

    @Test
    void setAutor() {
        libro.setAutor("Robert Fisher");
        assertEquals("Robert Fisher", libro.getAutor());
    }

    @Test
    void getAnioPublicacion() {
        assertEquals(1987, libro.getAnioPublicacion());
    }

    @Test
    void setAnioPublicacion() {
        libro.setAnioPublicacion(1987);
        assertEquals(1987, libro.getAnioPublicacion());
    }
}
