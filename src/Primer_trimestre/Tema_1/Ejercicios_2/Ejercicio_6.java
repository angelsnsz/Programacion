package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero, por favor");
        int numero1= scanner.nextInt();
        System.out.println("Escribe un segundo numero, por favor");
        int numero2= scanner.nextInt();

        System.out.println("Tu primer numero es " + numero1 + " y tu segundo numero es " +numero2);
    }
}
