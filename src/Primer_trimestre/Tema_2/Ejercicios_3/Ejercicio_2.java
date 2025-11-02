package Primer_trimestre.Tema_2.Ejercicios_3;
/*
Escribe un metodo recursivo para calcular la serie de Fibonacci hasta n.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie de Fibonacci hasta " + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + ",");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
