package Primer_trimestre.Tema_1.Ejercicios_1;
/*
Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
 A continuación, realiza las instrucciones necesarias para que:
 B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        int A = 67;
        int B = 23;
        int C = 16;
        int D = 37;


        B = 16;
        System.out.println("El valor de B es = " + B);

        C = 67;
        System.out.println("El valor de C es = " + C);

        A = 37;
        System.out.println("El valor de A es = " + A);

        D = 23;
        System.out.println("El valor de D es = " + D);
    }
}
