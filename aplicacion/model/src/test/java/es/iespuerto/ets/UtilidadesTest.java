package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

class UtilidadesTest {
    String nombreFichero = "producto.txt";

    @Test
    void obtenerPathTest() throws FileNotFoundException, URISyntaxException {
        String path = Utilidades.obtenerPathFichero(nombreFichero);
        assertEquals("", Utilidades.obtenerPathFichero(nombreFichero), "Se esperaba");
    }

}
