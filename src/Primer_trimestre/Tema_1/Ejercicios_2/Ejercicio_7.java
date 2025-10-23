package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una velocidad Km/h");

        int numero = scanner.nextInt();
        double velocidad = numero / 3.6;

        System.out.println("Tu velocidad en m/s es : " + velocidad);

    }
}
