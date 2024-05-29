package tarea3.codigoInterno;
/**
 * Clase de Moneda que se utiliza para pago y/o vuelto
 * @author Ariel Cisternas
 */
abstract class Moneda implements Comparable<Moneda> {
    /**Constructor para inicializar la clase */
    public Moneda(){}
    /**
     * Metodo en el cual se llama al numero de serie de la Moneda
     * @return el numero de serie
     */
    public Moneda getSerie(){
        return this;
    }
    /**
     * Metodo abstracto en el cual las subclases de Moneda le daran una funcionalidad para obtener su valor
     * @return un int con la cantidad correspondiente de la subclase
     */
    public abstract int getValor();
    /**
     * Metodo donde se compara el valor de la Moneda y el precio del producto
     * @param o Precio del Producto
     * @return un int del -1 al 1
     */
    public abstract int compareTo(int o);
}
/**Las siguiente subclases utilizan los mismos métodos con ligeras diferencias, pondremos de ejemplo solo una de estas */
/**
 * Clase Moneda que se utiliza para pagar dentro del Expendedor
 */
class Moneda1500 extends Moneda {
    /**Constructor el cual llama a la superclase */
    public Moneda1500(){
        super();
    }
    /**
     * En este caso, el metodo retorna el int que se encuentra junto al nombre de la Moneda, por ejemplo: 1500 
     * @return int 1500 (Valor indicado en el Nombre de la clase)
    */
    public int getValor(){
        return 1500;
    }
    /**
     * Se utiliza el metodo de comparable, cambiandolo a favor de la clase
     * Metodo en el cual se compara la Moneda con el Precio del producto
     * @return 1 si la Moneda es mayor al precio del producto,
     * -1 si la Moneda es menor al precio del producto,
     * 0 si la Moneda es igual al precio del producto
     */
    @Override
    public int compareTo(int o) {
        if (this.getValor() > o) {
            return 1;
        } else if (this.getValor() < o) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    public int getValor() {
        return 1000;
    }

    @Override
    public int compareTo(int o) {
        if (this.getValor() > o) {
            return 1;
        } else if (this.getValor() < o) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
    @Override
    public int compareTo(int o) {
        if (this.getValor() > o) {
            return 1;
        } else if (this.getValor() < o) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

/**Notar que esta clase se utiliza tanto para pagar como para dar vuelto */
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
    @Override
    public int compareTo(int o) {
        if (this.getValor() > o) {
            return 1;
        } else if (this.getValor() < o) {
            return -1;
        }
        else {
            return 0;
        }
    }
}