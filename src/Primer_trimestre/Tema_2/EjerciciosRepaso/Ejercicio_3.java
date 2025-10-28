package Primer_trimestre.Tema_2.EjerciciosRepaso;
/*
Implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado.
 */
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("Y tu edad?");
        int edad = scanner.nextInt();

        scanner.close();

        mensaje(nombre, edad);

    }
    static void mensaje(String nombre, int edad) {
        System.out.printf("Hola %s!! Tienes %d años", nombre, edad);
    }

}
