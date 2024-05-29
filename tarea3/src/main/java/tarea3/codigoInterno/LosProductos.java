package tarea3.codigoInterno;

/**
 * Enumeración de los Productos
 * @author Maria Jesus Olivares
 */

enum LosProductos{
    /** Se enumeran los productos (Sean Dulces o Bebidas) para facilitar procesos */ 
    SNICKERS(1),
    SUPER8(2),
    COCACOLA(3),
    SPRITE(4),
    FANTA(5);

    /** Int para asignar precios a cada producto*/
    private int precio;
    /** Final int del numero de cada producto, así no se cambia su enumeracion*/
    private final int num;

    /**
     * "Constructor" que proporciona el numero de cada producto
     * @param num Int final que corresponde a cada producto (Snickers es 1)
     */
    LosProductos(int num){
        this.num = num;
    }

    /**
     * Metodo que asigna y retorna un precio fijado de cada producto
     * Se utiliza switch / case según el numero del cual se consulta (Snickers(1) = 1100)
     * @return int del Precio del Producto seleccionado
     */
    public int getPrecio(){
        switch (num) {
            case 1:
                precio = 1100;
                break;
            case 2:
                precio = 900;
                break;
            case 3:
                precio = 1000;
                break;
            case 4:
                precio = 900;
                break;
            case 5:
                precio = 800;
                break;
            default:
                break;
        }
        return precio;
    }
    public int getNumero(){
        return num;
    }
}
