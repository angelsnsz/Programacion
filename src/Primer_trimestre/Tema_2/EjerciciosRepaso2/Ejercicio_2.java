package Primer_trimestre.Tema_2.EjerciciosRepaso2;

import java.util.Scanner;

/*
Crea una clase Java llamada Fibonacci, que contenga una función que devuelva en un String los N
primeros números de la serie de Fibonacci. Por ejemplo:
Se pasa 3: devolverá "1 1 2".
Se pasa 5: devolverá "1 1 2 3 5"
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("De cuantos numeros quieres la serie de Fibonacci?");
        int veces = scanner.nextInt();


        System.out.print(fibonacci(veces));

        System.out.println();
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

}
