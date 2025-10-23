package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Realiza un programa que permita la entrada de varios números y calcule su media.
 */
public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe otro numero, por favor:");
        int numero2 = scanner.nextInt();
        System.out.println("Escribe un tercer numero, por favor:");
        int numero3 = scanner.nextInt();
        int media = numero1 + numero2 + numero3 / 3;
        System.out.println("La media de los 3 numeros es:" + media);
    }
}
