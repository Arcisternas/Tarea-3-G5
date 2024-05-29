package tarea3.codigoInterno.Productos;

import tarea3.codigoInterno.Productos.Bebidas.Bebida;
import tarea3.codigoInterno.Productos.Dulces.Dulce;

/**
 * SuperClase de Productos de tipo Bebida y Dulce
 * @author Maria Jesus Olivares
 */

public abstract class Producto {
    //int para almacenar el numero de serie de los productos
    private int serie;
    /**
     * Constructor donde se registrará el numero de serie
     * @param serie este parametro define el numero de serie de los productos
     */
    public Producto(int serie) {
        this.serie = serie;
    } 
    /**
     * Metodo en el cual se utiliza un getter para obtener el numero de serie
     * @return retorna el nuemero de serie guardado en el int
     */
    public int getSerie(){
        return serie;
    }
    /**
     * Metodo abstracto que utilizarán y definirán las subclases de Bebida y Dulce
     * @return un String con el nombre del producto
     * @see Dulce
     * @see Bebida
     */
    public abstract String consumir();
    
} 