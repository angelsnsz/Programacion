package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Programa Java que declare una variable B de tipo entero y asígnale un valor.
 A continuación, muestra un mensaje indicando si el valor de B es positivo o negativo.
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        int B= 23;
        System.out.println((B >= 0) ? "El numero " + B + " es positivo" : "El numero " + B + " es negativo");
    }
}
