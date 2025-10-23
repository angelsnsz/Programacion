package Primer_trimestre.Tema_2.Pruebas;

import java.util.Scanner;

public class PruebasConElSi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            System.out.println("Introduce tu edad");
            int edad = scanner.nextInt();

            if (edad >= 65) {
                System.out.println("Estas jubilado");
            } else if (edad >= 18) {
                System.out.println("Eres trabajador");
            } else {
                System.out.println("Eres menor de edad");
            }
        }
        

        scanner.close();
    }
}
