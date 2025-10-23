package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
 */
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor");
        int numero = scanner.nextInt();
        int numero2 = numero * 2;
        int numero3 = numero * 3;
        System.out.println("El doble de tu numero es : " + numero2 + " Y el triple de tu numero es : " + numero3);
    }
}
