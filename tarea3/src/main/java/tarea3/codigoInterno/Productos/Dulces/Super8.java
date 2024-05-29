package tarea3.codigoInterno.Productos.Dulces;

public class Super8 extends Dulce{
    /**
     * Constructor del Dulce Super8
     * @param serie asigna el valor de numero de serie invocando a la superclase
     */
    public Super8(int serie){
        super(serie);
    }
     /**
     * Metodo que devuelve el nombre de la Bebida al Consumirse
     * @return Un String con el nombre, en este caso "super8"
     */
    public String consumir(){
        return "super8";
    }
}
