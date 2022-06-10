package es.iespuerto.ets;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilidades {
    public List<Producto> productos= new ArrayList<>();

    public List<Producto> leerProductos(String ficheroProductos) throws FileNotFoundException, URISyntaxException {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroProductos)));
        ArrayList<Producto> productos = new ArrayList<>();
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            productos.add(new Producto(Integer.parseInt(lineaDatos[0]), lineaDatos[1], 
                Double.parseDouble(lineaDatos[2]), Double.parseDouble(lineaDatos[3]),Integer.parseInt(lineaDatos[4])));
        }
        return productos;
    }

    /**
     * Funcion encargada de obtener el path del ficero
     * @param nombreFichero Nombre del fichero a buscar
     * @return Path completo del fichero
     * @throws URISyntaxException Exception por la URL mal formada
     */
    public static String obtenerPathFichero(String nombreFichero) throws FileNotFoundException, URISyntaxException {
        Utilidades util=new Utilidades();
        URL res = util.getClass().getClassLoader().getResource(nombreFichero);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
}
