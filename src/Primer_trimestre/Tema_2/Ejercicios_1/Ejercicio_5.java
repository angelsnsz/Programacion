package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Crea un programa que pide tu edad y compruebe si puedes votar.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Escribe tu edad, por favor:");
        int edad = scanner.nextInt();
        if (edad >= 18){
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
        scanner.close();
    }
}
