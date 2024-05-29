package tarea3.codigoInterno.Productos.Bebidas;

public class Fanta extends Bebida {
    /**
     * Constructor de la Bebida Fanta
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public Fanta(int serie) {
        super(serie);
    }
    /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "fanta"
     */
    public String consumir() {
        return "fanta";
    }
}
