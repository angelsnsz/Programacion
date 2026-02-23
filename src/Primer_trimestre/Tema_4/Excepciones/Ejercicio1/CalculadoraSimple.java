package Primer_trimestre.Tema_4.Excepciones.Ejercicio1;

public class CalculadoraSimple {

    public void dividir(int a , int b){
        try{
            int resultado=a/b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }
    }

}
