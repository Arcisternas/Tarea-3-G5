package tarea3.codigoInterno.Productos.Bebidas;

public class Sprite extends Bebida {
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