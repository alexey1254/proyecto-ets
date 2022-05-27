package es.iespuerto.ets;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

/**
 * Clase que sera usada para gestionar al empleado
 * 
 * @author Grace
 */
public class GestionarEmpleado {
    private List<Empleado> empleados = new ArrayList<>();

    /**
     * Funcion que permite leer los elementos del fichero de empleados
     * 
     * @param ficheroEmpleados Nombre del fichero de empleados
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public static List<Empleado> leerEmpleados() throws FileNotFoundException, URISyntaxException {
        List<Empleado> empleados = new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero("empleado.txt")));
        int dia, mes, anio;
        String linea, fechaString;
        Fecha fecha;
        String[] lineaDatos, fechaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            fechaString = lineaDatos[5];
            fechaDatos = fechaString.split("/");
            dia = Integer.parseInt(fechaDatos[0]);
            mes = Integer.parseInt(fechaDatos[1]);
            anio = Integer.parseInt(fechaDatos[2]);
            fecha = new Fecha(dia, mes, anio);

            empleados.add(new Empleado(Integer.parseInt(lineaDatos[0]), lineaDatos[1], lineaDatos[2],
                    lineaDatos[3], lineaDatos[4], fecha, lineaDatos[6]));
        }
        return empleados;
    }

    /**
     * Funcion que devuelve la lista de empleados
     * 
     * @return Lista de empleados.
     * @throws URISyntaxException
     * @throws FileNotFoundException
     */
    public List<Empleado> getEmpleados() throws FileNotFoundException, URISyntaxException {
        return empleados;
    }

    /**
     * Funcion que permite ver o buscar un empleado.
     * 
     * @param codigo    Codigo del empleado que se desea buscar
     * @param empleados Lista de empleados
     * @return Devuelve al empleado relacionado con el codigo
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public Empleado verEmpleado(int codigo, List<Empleado> empleados) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        return empleados.get(posicion);
    }

    /**
     * Método que permite insertar o dar de alta un empleado si no existe
     * previamente.
     * 
     * @param codigo    Codigo del empleado
     * @param dni       DNI del empleado
     * @param nombre    Nombre del empleado
     * @param apellido1 Primer apellido del empleado
     * @param apellido2 Segundo apellido del empleado
     * @param fechNac   fecha de nacimiento del empleado
     * @param cargo     que ostenta el empleado
     */
    public void altaEmpleado(int codigo, String dni, String nombre, String apellido1, String apellido2, Fecha fechNac,
            String cargo) {
        boolean existe = false;

        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                existe = true;
            }
        }
        if (!existe) {
            empleados.add(new Empleado(codigo, dni, nombre, apellido1, apellido2, fechNac, cargo));
        }
    }

    /**
     * Método que permite eliminar o dar de baja a un empleado si existe.
     * 
     * @param codigo Codigo del empleado a dar de baja
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void bajaEmpleado(int codigo) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.remove(posicion);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia el dni del empleado por el dni pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param dni    Nuevo dni del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void editarDniEmpleado(int codigo, String dni) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setDni(dni);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia el nombre del empleado por el nombre pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param nombre Nuevo nombre del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void editarNombreEmpleado(int codigo, String nombre) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setNombre(nombre);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia el primer apellido del empleado por el apellido pasado.
     * 
     * @param codigo    Codigo del empleado a editar.
     * @param apellido1 Nuevo primer apellido del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void editarApellido1Empleado(int codigo, String apellido1) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setApellido1(apellido1);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia el segundo apellido del empleado por el apellido
     * pasado.
     * 
     * @param codigo    Codigo del empleado a editar.
     * @param apellido2 Nuevo segundo apellido del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void editarApellido2Empleado(int codigo, String apellido2) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setApellido2(apellido2);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia la fecha de nacimiento del empleado por la fecha
     * pasada.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param fecha  Nuevo fecha de nacimiento del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public void editarFechNacEmpleado(int codigo, Fecha fecha) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setFechNac(fecha);
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el
     * codigo pasado, cambia el cargo del empleado por el cargo pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param cargo  Nuevo cargo del empleado.
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */

    public void editarCargo(int codigo, String cargo) throws Exception {
        Integer posicion = null;
        posicion = encontrarEmpleado(codigo);
        empleados.get(posicion).setCargo(cargo);
    }

    /**
     * Comprueba si existe el empleado en la lista
     * 
     * @param codigo codigo del empleado a comprobar
     * @return Devuelve la posicion del empleado en la lista
     * @throws Exception Excepcion en caso de no encontrar al empleado
     */
    public Integer encontrarEmpleado(int codigo) throws Exception {
        int i = 0;
        while (i < empleados.size()) {
            Empleado empleado = empleados.get(i);
            if (empleado.getCodigo() == codigo) {
                return i;
            }
            i++;
        }
        throw new Exception("No se ha encontrado el empleado.");

    }
}