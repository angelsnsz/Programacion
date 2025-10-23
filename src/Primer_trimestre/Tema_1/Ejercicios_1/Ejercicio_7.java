package Primer_trimestre.Tema_1.Ejercicios_1;
/*
Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int,
 dos variables N y M de tipo double y asigna a cada una un valor.
 A continuación realiza y muestra por pantalla una serie de operaciones entre ellas.
 */
public class Ejercicio_7 {
    public static void main(String[] args) {

     int X = 34;
     int Y = 87;
     double N = 23.4;
     double M = 65.9;

     double suma = X + N;
     System.out.println("X + N = " + suma);
     double division = M / Y;
        System.out.println("M / Y = " + division);
     double multiplicacion = M * X;
        System.out.println("M * Y = " + multiplicacion);

    }
}
