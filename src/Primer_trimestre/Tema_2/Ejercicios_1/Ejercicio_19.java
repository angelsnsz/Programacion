package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.
 */
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        int numero = scanner.nextInt();
        for (int i =0; i < numero; i++){
            i+=1;
            System.out.println(i);
        }
    }
}
