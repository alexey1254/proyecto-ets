package es.iespuerto.ets;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

/**
 * Clase que sera usada para gestionar el producto
 * @author Grace
 */
public class GestionarProducto {
    private List<Producto> productos = new ArrayList<>();


    /**
     * Funcion que permite leer los elementos del fichero de Productos
     * @param ficheroProductos Nombre del fichero de Productos
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public List<Producto> leerProductos() throws FileNotFoundException, URISyntaxException {
        List<Producto> productos= new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero("producto.txt")));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            productos.add(new Producto(Integer.parseInt(lineaDatos[0]), lineaDatos[1], 
                Double.parseDouble(lineaDatos[2]), Double.parseDouble(lineaDatos[3]),Integer.parseInt(lineaDatos[4])));
        }
        fichero.close();
        return productos;
    }

    /**
     * Funcion que permite ver o buscar un producto.
     * @param codigo Codigo del producto que se desea buscar
     * @param productos Lista de productos
     * @return Devuelve el producto relacionado con el codigo
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public Producto verProducto(int codigo, List<Producto> productos) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        return productos.get(posicion);
    }

    /**
     * Agrega un nuevo producto a la lista de productos si el producto aun no existe.
     * @param codigo Codigo del producto
     * @param nombre Nombre del producto
     * @param peso Peso del producto
     * @param precio Precio del producto
     * @param stock Unidades de producto disponible
     */
    public void altaProducto(int codigo, String nombre, double peso, double precio, int stock) {
        boolean existe=false;

        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                existe=true;
            }
        }
        if(!existe){
            productos.add(new Producto(codigo, nombre, peso,precio,stock));
        }
    }

    /**
     * Método que permite eliminar o dar de baja a un producto si existe.
     * @param codigo Codigo del producto a dar de baja
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public void bajaProducto(int codigo) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        productos.remove(posicion);
    }

    /**
     * Recorre la lista de productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia el nombre del producto por el nombre pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param nombre Nuevo nombre del producto.
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public void editarNombreProducto(int codigo,String nombre) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        productos.get(posicion).setNombre(nombre);
    }

    /**
     * Recorre la lista de Productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia precio del producto por el precio pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param peso Nuevo peso del producto.
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public void editarPesoProducto(int codigo,double peso) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        productos.get(posicion).setPeso(peso);
    }

    /**
     * Recorre la lista de productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia peso del producto por el peso pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param precio Nuevo precio del producto.
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public void editarPrecioProducto(int codigo,double precio) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        productos.get(posicion).setPrecio(precio);
    }

    /**
     * Recorre la lista de Productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia el stock disponible del producto por el stock pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param stock Nuevo stock del producto.
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public void editarStockProducto(int codigo,int stock) throws Exception {
        Integer posicion = null;
        posicion = encontrarProducto(codigo);
        productos.get(posicion).setStock(stock);
    }

    /**
     * Comprueba si existe el producto en la lista
     * 
     * @param codigo codigo del producto a comprobar
     * @return Devuelve la posicion del producto en la lista
     * @throws Exception Excepcion en caso de no encontrar al producto
     */
    public Integer encontrarProducto(int codigo) throws Exception {
        int i=0;
        while(i<productos.size()){
            Producto producto = productos.get(i);
            if (producto.getCodigo() == codigo) {
               return i;
            }
            i++;
        }
        throw new Exception("No se ha encontrado el producto.");
    } 
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        GestionarProducto gs=new GestionarProducto();
        gs.leerProductos();
        System.out.println(gs);    
    }

}
