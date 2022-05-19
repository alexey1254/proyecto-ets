package es.iespuertodelacruz.ets;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

import es.iespuertodelacruz.ets.utilidades.Utilidades;

public class GestionarProducto {
    private List<Producto> productos = new ArrayList<>();


    /**
     * Funcion que permite leer los elementos del fichero de Productos
     * @param ficheroProductos Nombre del fichero de Productos
     * @throws FileNotFoundException Excepcion indicando que el fichero no existe
     */
    public List<Producto> leerProductos(String ficheroProductos) throws FileNotFoundException, URISyntaxException {
        List<Producto> productos= new ArrayList<>();
        Scanner fichero = new Scanner(new File(Utilidades.obtenerPathFichero(ficheroProductos)));
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
     * Funcion que permite ver o buscar un producto.
     * @param codigo Codigo del producto que se desea buscar
     * @param productos Lista de productos
     * @return Devuelve el producto relacionado con el codigo
     */
    public Producto verProducto(int codigo, List<Producto> productos) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                return pro;
            }
        }
        return null;
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
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                existe=true;
            }
        }
        if(!existe){
            productos.add(new Producto(codigo, nombre, peso, precio, stock));
        }
    }

    /**
     * Método que permite eliminar o dar de baja a un producto si existe.
     * @param codigo Codigo del producto a dar de baja
     */
    public void bajaProducto(int codigo) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
               productos.remove(pro);
            }
        }
    }

    /**
     * Recorre la lista de productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia el nombre del producto por el nombre pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param nombre Nuevo nombre del producto.
     */
    public void editarNombreProducto(int codigo,String nombre) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                pro.setNombre(nombre);
            }
        }
    }

    /**
     * Recorre la lista de Productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia precio del producto por el precio pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param peso Nuevo peso del producto.
     */
    public void editarPesoProducto(int codigo,double peso) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                pro.setPeso(peso);
            }
        }
    }

    /**
     * Recorre la lista de productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia peso del producto por el peso pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param precio Nuevo precio del producto.
     */
    public void editarPrecioProducto(int codigo,double precio) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                pro.setPrecio(precio);
            }
        }
    }

    /**
     * Recorre la lista de Productos y, si el codigo del producto coincide con el 
     * codigo pasado, cambia el stock disponible del producto por el stock pasado.
     * 
     * @param codigo Codigo del producto a editar.
     * @param stock Nuevo stock del producto.
     */
    public void editarStockProducto(int codigo,int stock) {
        for (Producto pro : productos) {
            if (pro.getCodigo() == codigo) {
                pro.setStock(stock);
            }
        }
    }


}
