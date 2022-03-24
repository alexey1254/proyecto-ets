package es.iespuertodelacruz.ets;

/**
 * Clase Persona que sera usada por la clase Cliente y Empleado
 *
 */
public class Empleado {
    private int codigo;
    private Persona datos;
    private Fecha fechNac;
    private String cargo;
    
    /**
     * Constructor que recibe dos parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     */
    public Empleado(int codigo, Persona datos) {
        this.codigo = codigo;
        this.datos = datos;
    }

    /**
     * Constructor que recibe tres parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     */
    public Empleado(int codigo, Persona datos, Fecha fechNac) {
        this.codigo = codigo;
        this.datos = datos;
        this.fechNac = fechNac;
    }

    /**
     * Constructor que recibe cuatro parametros
     * @param codigo del empleado
     * @param datos dni, nombre y/o apellido del empleado
     * @param fechNac fecha de nacimiento del empleado
     * @param cargo que ostenta el empleado
     */
    public Empleado(int codigo, Persona datos, Fecha fechNac, String cargo) {
        this.codigo = codigo;
        this.datos = datos;
        this.fechNac = fechNac;
        this.cargo = cargo;
    }

    /**
     * Getter del codigo del empleado
     * @return codigo del empleado
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter del codigo del empleado
     * @param codigo del empleado
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter de los datos(dni, nombre, apellido) del empleado
     * @return datos del empleado
     */
    public Persona getDatos() {
        return datos;
    }

    /**
     * Setter de los datos del empleado
     * @param datos del empleado
     */
    public void setDatos(Persona datos) {
        this.datos = datos;
    }
    
    /**
     * Getter de la fecha de nacimiento del empleado
     * @return fecha de nacimiento
     */
    public Fecha getFechNac() {
        return fechNac;
    }

    /**
     * Setter de la fecha de nacimiento del empleado
     * @param fechNac fecha de nacimiento del empleado
     */
    public void setFechNac(Fecha fechNac) {
        this.fechNac = fechNac;
    }

    /**
     * Getter del ccargo que ostenta el cliente
     * @return cargo del cliente
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Setter del cargo del empleado
     * @param cargo del empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
