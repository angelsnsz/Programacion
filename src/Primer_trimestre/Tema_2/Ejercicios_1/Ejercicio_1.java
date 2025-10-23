package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Programa Java que lea un número entero y calcule si es par o impar.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        int numero = scanner.nextInt();
        if (numero % 2==0) {
            System.out.println("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }
        scanner.close();
    }
}
