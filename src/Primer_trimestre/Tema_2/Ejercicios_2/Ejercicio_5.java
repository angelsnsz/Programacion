package Primer_trimestre.Tema_2.Ejercicios_2;
/*
Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
 */

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int numVeces = sc.nextInt();

        for (int i = 1; i <= numVeces; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a + " ");
            }
            System.out.print("\n");
        }

    }
}
