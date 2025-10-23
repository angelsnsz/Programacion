package Primer_trimestre.Tema_2.Ejercicios_2;
/*
Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
El juego deberá indicarte si el número introducido es mayor o menor.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1;
        int numero = 0;

        do {
            System.out.println("Adivina el numero entre 1 y 10: ");
            numero = scanner.nextInt();
            if (numero < numeroAleatorio) {
                System.out.println("Tu numero es menor, escribe otro numero:");
            } else if (numero > numeroAleatorio) {
                System.out.println("Tu numero es mayor, escribe otro numero:");
            } else
                System.out.println("Correcto el numero es " + numeroAleatorio);
        } while (numero != numeroAleatorio);
    }
}
