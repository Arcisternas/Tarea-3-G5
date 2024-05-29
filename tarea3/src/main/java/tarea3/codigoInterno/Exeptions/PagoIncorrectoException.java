package tarea3.codigoInterno.Exeptions;
/**
 * Excepcion cuando no se ingresa una Moneda (null)
 * @author Ariel Cisternas
 */
public class PagoIncorrectoException extends Exception {
    /**
     * @param errorMessage Se ingresa un String con el mensaje de error
     */
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}