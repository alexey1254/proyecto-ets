package es.iespuerto.ets;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

/**
 * Clase que sera usada para gestionar al cliente
 * 
 * @author Grace
 */
public class GestionarCliente {
    private List<Cliente> clientes = new ArrayList<>();

    /**
     * Funcion que permite leer los elementos del fichero de clientes
     * 
     * @param ficheroClientes Nombre del fichero de clientes
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
<<<<<<< HEAD
    public static List<Cliente> leerClientes() throws FileNotFoundException, URISyntaxException {
        List<Cliente> clientes= new ArrayList<>();
=======
    public List<Cliente> leerClientes() throws FileNotFoundException, URISyntaxException {
>>>>>>> 5ca0e198544a60d0d2664ce03e72fd506c43bf6c
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero("cliente.txt")));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            clientes.add(new Cliente(Integer.parseInt(lineaDatos[0]), lineaDatos[1], lineaDatos[2],
                    lineaDatos[3], lineaDatos[4], lineaDatos[5]));
        }
        return clientes;
    }

    /**
     * Funcion que permite ver o buscar un cliente.
     * 
     * @param codigo   Codigo del cliente que se desea buscar
     * @param clientes Lista de clientes
     * @return Devuelve al cliente relacionado con el codigo
     */
    public Cliente verCliente(int codigo, List<Cliente> clientes) {
        for (Cliente cli : clientes) {
            if (cli.getCodigo() == codigo) {
                return cli;
            }
        }
        return null;
    }

    /**
     * Método que permite insertar o dar de alta un cliente si no existe
     * previamente.
     * 
     * @param codigo    Codigo del cliente
     * @param dni       DNI del cliente
     * @param nombre    Nombre del cliente
     * @param apellido1 Primer apellido del cliente
     * @param apellido2 Segundo apellido del cliente
     * @param direccion Direccion del cliente
     */
    public void altaCliente(int codigo, String dni, String nombre, String apellido1, String apellido2,
            String direccion) {
        boolean existe = false;
        for (Cliente cli : clientes) {
            if (cli.getCodigo() == codigo) {
                existe = true;
            }
        }
        if (!existe) {
            clientes.add(new Cliente(codigo, dni, nombre, apellido1, apellido2, direccion));
        }
    }

    /**
     * Método que permite eliminar o dar de baja a un cliente si existe.
     * 
     * @param codigo Codigo del cliente a dar de baja
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public void bajaCliente(int codigo) throws Exception {
        int posicion = encontrarCliente(codigo);
        clientes.remove(posicion);

    }

    /**
     * Recorre la lista de clientes y, si el codigo del cliente coincide con el
     * codigo pasado, cambia el dni del cliente por el dni pasado.
     * 
     * @param codigo Codigo del cliente a editar.
     * @param dni    Nuevo dni del cliente.
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public void editarDniCliente(int codigo, String dni) throws Exception {
        Integer posicion = null;
        posicion = encontrarCliente(codigo);
        clientes.get(posicion).setDni(dni);
    }

    /**
     * Recorre la lista de clientes y, si el codigo del cliente coincide con el
     * codigo pasado, cambia el nombre del cliente por el nombre pasado.
     * 
     * @param codigo Codigo del cliente a editar.
     * @param nombre Nuevo nombre del cliente.
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public void editarNombreCliente(int codigo, String nombre) throws Exception {
        Integer posicion = null;
        posicion = encontrarCliente(codigo);
        clientes.get(posicion).setNombre(nombre);
    }

    /**
     * Recorre la lista de clientes y, si el codigo del cliente coincide con el
     * codigo pasado, cambia el primer apellido del cliente por el apellido pasado.
     * 
     * @param codigo    Codigo del cliente a editar.
     * @param apellido1 Nuevo primer apellido del cliente.
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public void editarApellido1Cliente(int codigo, String apellido1) throws Exception {
        Integer posicion = null;
        posicion = encontrarCliente(codigo);
        clientes.get(posicion).setApellido1(apellido1);
    }

    /**
     * Recorre la lista de clientes y, si el codigo del cliente coincide con el
     * codigo pasado, cambia el segundo apellido del cliente por el apellido pasado.
     * 
     * @param codigo    Codigo del cliente a editar.
     * @param apellido2 Nuevo segundo apellido del cliente.
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public void editarApellido2Cliente(int codigo, String apellido2) throws Exception {
        Integer posicion = null;
        posicion = encontrarCliente(codigo);
        clientes.get(posicion).setApellido2(apellido2);
    }

    /**
     * Comprueba si existe el cliente en la lista
     * 
     * @param codigo codigo del cliente a comprobar
     * @return Devuelve la posicion del cliente en la lista
     * @throws Exception Excepcion en caso de no encontrar al cliente
     */
    public Integer encontrarCliente(int codigo) throws Exception {
        int i = 0;
        while (i < clientes.size()) {
            Cliente cliente = clientes.get(i);
            if (cliente.getCodigo() == codigo) {
                return i;
            }
            i++;
        }
        throw new Exception("No se ha encontrado el cliente.");

    }
}
