package Primer_trimestre.Tema_2.EjerciciosRepaso;

import java.util.Scanner;

/*
Crea un metodo para determinar si un número es par o impar.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero para saber si es par o impar");
        int numero = scanner.nextInt();

        parOImpar(numero);

    }

    private static void parOImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
