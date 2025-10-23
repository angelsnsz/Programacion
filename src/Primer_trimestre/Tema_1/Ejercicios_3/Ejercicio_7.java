package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 */
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una letra, por favor:");
        String letra = scanner.nextLine();
        char caracter = letra.charAt(0);
        System.out.println((caracter >=65 && caracter <=90)? caracter + " es mayúscula" : caracter + " es minuscula");
        scanner.close();
    }
}
