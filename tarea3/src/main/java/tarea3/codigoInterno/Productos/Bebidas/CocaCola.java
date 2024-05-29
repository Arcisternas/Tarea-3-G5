package tarea3.codigoInterno.Productos.Bebidas;

public class CocaCola extends Bebida {
    /**
     * Constructor de la Bebida CocaCola
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public CocaCola(int serie) {
        super(serie);
    }
    /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "cocacola"
     */
    public String consumir() {
        return "cocacola";
    }
}
