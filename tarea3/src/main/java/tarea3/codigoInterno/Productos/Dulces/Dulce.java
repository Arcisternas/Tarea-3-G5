package tarea3.codigoInterno.Productos.Dulces;

import tarea3.codigoInterno.Productos.Producto;

/**
 * Producto de tipo Dulce
 * @author Maria Jesus Olivares
 */

public abstract class Dulce extends Producto{
    /**
     * Constructor para el Producto de clase Dulce (Subclase de Producto)
     * @see Producto 
     * @param serie este parametro define el numero de serie de cada Dulce
     */
    public Dulce(int serie){
        super(serie);
    } 
} 