package tarea3.codigoInterno.Monedas;

public class Moneda1500 extends Moneda{
    /**Constructor el cual llama a la superclase */
    public Moneda1500(int serie){
        super(serie);
    }
    /**
     * En este caso, el metodo retorna el int que se encuentra junto al nombre de la Moneda, por ejemplo: 1500 
     * @return int 1500 (Valor indicado en el Nombre de la clase)
    */
    public int getValor(){
        return 1500;
    }
}
