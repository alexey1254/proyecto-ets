package es.iespuerto.ets;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Utilidades {

    /**
     * Funcion encargada de obtener el path del ficero
     * 
     * @param nombreFichero Nombre del fichero a buscar
     * @return Path completo del fichero
     * @throws URISyntaxException Exception por la URL mal formada
     */
    public static String obtenerPathFichero(String nombreFichero) throws FileNotFoundException, URISyntaxException {
        Utilidades util = new Utilidades();
        URL res = util.getClass().getClassLoader().getResource(nombreFichero);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
}
