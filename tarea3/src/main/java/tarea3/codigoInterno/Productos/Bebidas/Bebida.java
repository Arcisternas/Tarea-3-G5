package tarea3.codigoInterno.Productos.Bebidas;

import tarea3.codigoInterno.Productos.Producto;

/**
 * Producto de Tipo Bebida
 * @author Ariel Cisternas
 */
public abstract class Bebida extends Producto{
    /**
     * Constructor para el Producto de clase Bebida (Subclase de Producto)
     * @see Producto
     * @param serie este parametro define el numero de serie de cada Bebida
     */
    public Bebida(int serie) {
        super(serie);
    } 
}