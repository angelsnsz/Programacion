package Primer_trimestre.Tema_2.Ejercicios_2;

/*
Muestra los números primos entre 1 y 100.
 */
public class Ejercicio_8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int contador = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    }
}
