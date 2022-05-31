package es.iespuerto.ets;

import java.util.List;
import java.util.Scanner;
import java.util.logging.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class GestionarProveedor {
    private List<Proveedor> proveedores = new ArrayList<>();

    /**
     * Funcion que permite leer los elementos del fichero de Productos
     * 
     * @param ficheroProductos Nombre del fichero de Productos
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public List<Proveedor> leerProveedor() throws FileNotFoundException, URISyntaxException {
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

    /**
     * Agrega un proveedor si aun no se encuentra en la lista de proveedores
     * 
     * @param codigo
     * @param cif
     * @param nombre
     * @param direccion
     * @param telefono
     */
    public void altaProveedor(int codigo, String cif, String nombre, String direccion, int telefono) {
        boolean existe = false;

        for (Proveedor proveedor : proveedores) {
            if (proveedor.getCif() == cif) {
                existe = true;
            }
        }
        if (!existe) {
            proveedores.add(new Proveedor(codigo, cif, nombre, direccion, telefono));
        }
    }

    /**
     * 
     * @param cif         del proveedor
     * @param proveedores Lista de proveedores
     * @return El proveedor
     */
    public Proveedor verProveedor(String cif, List<Proveedor> proveedores) {
        Integer posicion = null;
        try {
            posicion = encontrarProveedor(cif);
        } catch (Exception e) {
            System.err.println("No se ha encontrado el proveedor");
        }
        return proveedores.get(posicion);
    }

    public void editarNombreProveedor(String cif, String nombre) throws Exception {
        Integer posicion = null;
        try {
            posicion = encontrarProveedor(cif);
            proveedores.get(posicion).setNombre(nombre);
        } catch (Exception e) {
            System.err.println("No se ha podido encontrar el proveedor");
        }

    }

    /**
     * Elimina un proveedor de la lista
     * 
     * @param cif del proveedor
     * @throws Exception Si no se encuentra el producto
     */
    public void bajaProveedor(String cif) {
        try {
            int posicion = encontrarProveedor(cif);
            proveedores.remove(posicion);
        } catch (Exception e) {
            System.err.println("No se ha podido encontrar el producto.");
            // Logger.log(new Level("Poco relevante", 0),"No se ha podido dar de baja porque
            // no se ha encontrado el producto.");
        }

    }

    /**
     * Comprueba si existe el proveedor en la lista
     * 
     * @param cif del proveedor
     * @return Posicion del proveedor en la lista
     * @throws Exception En caso de no encontrar el proveedor
     */
    public Integer encontrarProveedor(String cif) throws Exception {
        int i = 0;
        while (i < proveedores.size()) {
            Proveedor proveedor = proveedores.get(i);
            if (proveedor.getCif().equals(cif)) {
                return i;
            }
            i++;
        }
        throw new Exception("No se ha encontrado el producto.");
    }
}
