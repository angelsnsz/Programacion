package Primer_trimestre.Tema_1.Ejercicios_1;
/*
Programa java que realice lo siguiente: declarar una variable N de tipo int,
una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
 A continuación, muestra por pantalla:
 El valor de cada variable, la suma de N + A, la diferencia de A - N,
 el valor numérico correspondiente al carácter que contiene la variable C.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        int N =23;
        double A = 45.2;
        char C= 'b';

        System.out.println("El valor de N es : " + N);
        System.out.println("El valor de A es : " + A);
        System.out.println("El valor de C es : " + C);

        double suma = N + A;
        System.out.println("N + A = " + suma);

        double diferencia = A - N;
        System.out.println("A - N = " + diferencia);

        System.out.println("El valor numerico de C es : " + (int) C );
    }
}
