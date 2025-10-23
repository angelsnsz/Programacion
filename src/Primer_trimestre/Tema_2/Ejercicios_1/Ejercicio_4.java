package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        double numero1 =scanner.nextDouble();
        System.out.println("Escribe un segundo numero, por favor: ");
        double numero2 =scanner.nextDouble();
        if (numero2==0){
            System.out.println("Modifica tu numero, por favor:");
            double numero3 =scanner.nextDouble();
            System.out.println("El resultado de la division es: " +numero1 / numero3);
        }
        else {
            System.out.println( "El resultado de la division es: " +numero1 / numero2);
        }
        scanner.close();
    }
}
