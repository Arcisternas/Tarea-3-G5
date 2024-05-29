package tarea3.codigoInterno.Exeptions;

/**
 * Excepcion cuando la Moneda es menor al Precio
 * @author Ariel Cisternas
 */

public class PagoInsuficienteException extends Exception {
    /**
     * @param errorMessage Se ingresa un String con el mensaje de error 
     */
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
