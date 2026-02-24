package Primer_trimestre.Tema_4.Excepciones.Ejercicio5;

public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String message) {
        super(message);
    }
}