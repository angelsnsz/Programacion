package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.
 */
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
}
