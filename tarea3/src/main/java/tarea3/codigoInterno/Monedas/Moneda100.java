package tarea3.codigoInterno.Monedas;

/**Notar que esta clase se utiliza tanto para pagar como para dar vuelto */
public class Moneda100 extends Moneda{
    public Moneda100(int serie){
        super(serie);
    }
    public int getValor(){
        return 100;
    }
}