package tarea3.codigoInterno;

/**
 * Producto de tipo Dulce
 * @author Maria Jesus Olivares
 */

abstract class Dulce extends Producto{
    /**
     * Constructor para el Producto de clase Dulce (Subclase de Producto)
     * @see Producto 
     * @param serie este parametro define el numero de serie de cada Dulce
     */
    public Dulce(int serie){
        super(serie);
    } 
} 

/**
 * Las siguientes clases son Subclases de la clase abstracta Dulce (superclase de estas)
 * Todas comparten características y métodos, por lo que se tomará de ejemplo solo una de estas
 */
class Snickers extends Dulce{
    /**
     * Constructor del Dulce Snickers
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public Snickers(int serie){
        super(serie);
    }
    /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "snickers"
     */
    public String consumir(){
        return "snickers";
    } 
}

class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String consumir(){
        return "super8";
    }
}
