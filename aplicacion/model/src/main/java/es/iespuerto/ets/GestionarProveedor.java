package es.iespuerto.ets;

import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class GestionarProveedor {
    private List<Proveedor> proveedores = new ArrayList<>(); // TODO: Revisar si esta todo bien. (ALE)

    /**
     * Funcion que permite leer los elementos del fichero de Productos
     * 
     * @param ficheroProductos Nombre del fichero de Productos
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public List<Proveedor> leerProveedor() throws FileNotFoundException, URISyntaxException {
        List<Proveedor> proveedores = new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero("proveedor.txt")));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            proveedores.add(new Proveedor(Integer.parseInt(lineaDatos[0]), lineaDatos[1], lineaDatos[2], lineaDatos[3],
                    Integer.parseInt(lineaDatos[4])));
        }
        fichero.close();
        return proveedores;
    }
}
