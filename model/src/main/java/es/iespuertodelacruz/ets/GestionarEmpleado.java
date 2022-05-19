package es.iespuertodelacruz.ets;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

import es.iespuertodelacruz.ets.utilidades.Utilidades;

public class GestionarEmpleado {
    private List<Empleado> empleados=new ArrayList<>(); 

    /**
     * Funcion que permite leer los elementos del fichero de empleados
     * @param ficheroEmpleados Nombre del fichero de empleados
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public List<Empleado> leerEmpleados(String ficheroEmpleados) throws FileNotFoundException, URISyntaxException {
        List<Empleado> empleados= new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero(ficheroEmpleados)));
        String linea,fechaString;
        Fecha fecha;
        String[] lineaDatos,fechaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            fechaString=lineaDatos[5];
            fechaDatos=fechaString.split("/");
            fecha=new Fecha(Integer.parseInt(fechaDatos[0]), Integer.parseInt(fechaDatos[1]), Integer.parseInt(fechaDatos[2]))

            empleados.add(new Empleado(Integer.parseInt(lineaDatos[0]), lineaDatos[1], lineaDatos[2],
                    lineaDatos[3], lineaDatos[4],fecha,lineaDatos[6]));
        }
        return empleados;
    }

    /**
     * Funcion que permite ver o buscar un empleado.
     * @param codigo Codigo del empleado que se desea buscar
     * @param empleados Lista de empleados
     * @return Devuelve al empleado relacionado con el codigo
     */
    public Empleado verEmpleado(int codigo, List<Empleado> empleados) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                return emp;
            }
        }
        return null;
    }

    /**
     * Método que permite insertar o dar de alta un empleado si no existe previamente.
     * @param codigo Codigo del empleado
     * @param dni DNI del empleado
     * @param nombre Nombre del empleado
     * @param apellido1 Primer apellido del empleado
     * @param apellido2 Segundo apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     * @param cargo que ostenta el empleado
     */
    public void altaEmpleado(int codigo,String dni, String nombre, String apellido1, String apellido2, Fecha fechNac, String cargo) {
        boolean existe=false;
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                existe=true;
            }
        }
        if(!existe){
            empleados.add(new Empleado(codigo, dni, nombre, apellido1, apellido2, fechNac, cargo));
        }
    }

    /**
     * Método que permite eliminar o dar de baja a un empleado si existe.
     * @param codigo Codigo del empleado a dar de baja
     */
    public void bajaEmpleado(int codigo) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                empleados.remove(emp);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia el dni del empleado por el dni pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param dni Nuevo dni del empleado.
     */
    public void editarDniEmpleado(int codigo,String dni) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setDni(dni);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia el nombre del empleado por el nombre pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param nombre Nuevo nombre del empleado.
     */
    public void editarNombreEmpleado(int codigo,String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setNombre(nombre);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia el primer apellido del empleado por el apellido pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param apellido1 Nuevo primer apellido del empleado.
     */
    public void editarApellido1Empleado(int codigo,String apellido1) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setApellido1(apellido1);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia el segundo apellido del empleado por el apellido pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param apellido2 Nuevo segundo apellido del empleado.
     */
    public void editarApellido2Empleado(int codigo,String apellido2) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setApellido2(apellido2);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia la fecha de nacimiento del empleado por la fecha pasada.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param fecha Nuevo fecha de nacimiento del empleado.
     */
    public void editarFechNacEmpleado(int codigo,Fecha fecha) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setFechNac(fecha);
            }
        }
    }

    /**
     * Recorre la lista de empleados y, si el codigo del empleado coincide con el 
     * codigo pasado, cambia el cargo del empleado por el cargo pasado.
     * 
     * @param codigo Codigo del empleado a editar.
     * @param cargo Nuevo cargo del empleado.
     */
    public void editarFechNacEmpleado(int codigo,String cargo) {
        for (Empleado emp : empleados) {
            if (emp.getCodigo() == codigo) {
                emp.setCargo(cargo);
            }
        }
    }
}