package es.iespuertodelacruz.ets.model;

/**
 * Clase Empleado.
 * @author Grace
 */
public class Empleado extends Persona {

    private int codigo;
    private Fecha fechNac;
    private String cargo;

    /**
     * Constructor de Empleado que recibe siete parametros
     * @param codigo Codigo del empleado
     * @param dni DNI del empleado
     * @param nombre Nombre del empleado
     * @param apellido1 Primer apellido del empleado
     * @param apellido2 Segundo apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     * @param cargo que ostenta el empleado
     */
    public Empleado(int codigo,String dni, String nombre, String apellido1, String apellido2, Fecha fechNac, String cargo) {
        super(dni, nombre, apellido1,apellido2);
        this.codigo = codigo;
        this.fechNac = fechNac;
        this.cargo = cargo;
    }

    /**
     * Getter del codigo del empleado
     * @return Devuelve codigo del empleado
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Getter del dni del empleado
     * @return Devuelve el dni del empleado
     */
    public String getDni() {
        return super.getDni();
    }

    /**
     * Setter del dni del empleado
     * @param dni Nuevo dni del empleado
     */
    public void setDni(String dni) {
        super.setDni(dni);
    }

    /**
     * Getter del nombre del empleado
     * @return Devuelve el nombre del empleado
     */
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Setter del nombre del empleado
     * @param nombre Nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    /**
     * Getter del apellido1 del empleado
     * @return Devuelve el primer apellido del empleado
     */
    public String getApellido1() {
        return super.getApellido1();
    }

    /**
     * Setter del primer apellido del empleado
     * @param apellido1 Nuevo primer apellido del empleado
     */
    public void setApellido1(String apellido1) {
        super.setApellido1(apellido1);
    }

    /**
     * Getter del apellido2 del empleado
     * @return Devuelve el segundo apellido del empleado
     */
    public String getApellido2() {
        return super.getApellido2();
    }

    /**
     * Setter del segundo apellido del empleado
     * @param apellido2 Nuevo segundo apellido del empleado
     */
    public void setApellido2(String apellido2) {
        super.setApellido2(apellido2);
    }

    /**
     * Getter de la fecha de nacimiento del empleado
     * @return Devuelve la fecha de nacimiento del empleado
     */
    public Fecha getFechNac() {
        return this.fechNac;
    }

    /**
     * Setter de la fecha de nacimiento del empleado
     * @param fechNac fecha de nacimiento del empleado
     */
    public void setFechNac(Fecha fechNac) {
        this.fechNac = fechNac;
    }
    
    /**
     * Getter de la fecha de nacimiento del empleado
     * @return Devuelve el cargo del empleado
     */
    public String getCargo() {
        return this.cargo;
    }

    /**
     * Setter del cargo del empleado
     * @param cargo Nuevo cargo del empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
