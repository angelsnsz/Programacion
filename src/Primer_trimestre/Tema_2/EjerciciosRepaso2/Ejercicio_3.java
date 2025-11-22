package Primer_trimestre.Tema_2.EjerciciosRepaso2;

import java.util.Scanner;

/*
Crea un metodo llamado pintar triángulo, que reciba un parámetro (int niveles) y, utilizando el metodo anterior,
 pinte lo siguiente, por ejemplo con 6 niveles:

 1
 11
 112
 1123
 11235
 112358
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("De cuantos numeros quieres la serie de Fibonacci?");
        int veces = scanner.nextInt();


        System.out.print(fibonacci(veces));

        System.out.println();

        for (int i = 0; i <= veces; i++) {
            System.out.println(pintarTriangulo(i));
        }


        scanner.close();

    }

    static String fibonacci(int veces) {
        int[] serie = new int[veces];
        String fibonacci = "";

        int num1 = 1, num2 = 0, aux;

        for (int i = 0; i < veces; i++) {
            serie[i] = num1;
            aux = num1;
            num1 += num2;
            num2 = aux;
        }

        for (int n : serie) {
            fibonacci += n + " ";
        }
        return fibonacci;
    }

    static String pintarTriangulo(int veces) {
        String fila = "";
        for (int i = 1; i <= veces; i++) {
            fila = fibonacci(i) + " ";
        }

        return fila;

    }
}


