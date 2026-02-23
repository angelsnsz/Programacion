package Primer_trimestre.Tema_4.Excepciones.Ejercicio2;

public class ValidarNumero {
    public void validarPositivo(int numero){
        if (numero < 0){
            throw new IllegalArgumentException("El numero no es positivo");
        }
        System.out.println("Numero positivo" + numero);
    }
}
