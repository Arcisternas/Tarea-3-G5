package tarea3.codigoInterno;
/**
 * Producto de Tipo Bebida
 * @author Ariel Cisternas
 */
abstract class Bebida extends Producto{
    /**
     * Constructor para el Producto de clase Bebida (Subclase de Producto)
     * @see Producto
     * @param serie este parametro define el numero de serie de cada Bebida
     */
    public Bebida(int serie) {
        super(serie);
    } 
}

/**
 * Las siguientes clases son Subclases de la clase abstracta Bebida (superclase de estas)
 * Todas comparten características y métodos, por lo que se tomará de ejemplo solo una de estas
 */
 class Sprite extends Bebida {
    /**
     * Constructor de la Bebida Sprite 
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public Sprite(int serie) {
        super(serie);
    } 

    /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "sprite"
     */
    public String consumir() {
        return "sprite";
    } 
} 

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }
    public String consumir() {
        return "cocacola";
    }
}
class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie);
    }
    public String consumir() {
        return "fanta";
    }
}