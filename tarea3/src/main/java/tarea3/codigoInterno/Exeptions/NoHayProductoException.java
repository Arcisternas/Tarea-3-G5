package tarea3.codigoInterno.Exeptions;
/**
 * Excepcion cuando no hay producto o el Deposito es Erroneo
 * @author Ariel Cisternas
 */
public class NoHayProductoException extends Exception {
    
    /**
     * @param errorMessage Se ingresa un String con el mensaje de error
     */
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}
