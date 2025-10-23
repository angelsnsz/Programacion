package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área.
 */
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el radio de una circunferencia, por favor: ");
        double radio = scanner.nextDouble();
        System.out.println("La longitud del perimetro es: " + (2*Math.PI*radio) +
        " y el area es : " + (Math.PI*radio*radio));
        scanner.close();
    }
}
