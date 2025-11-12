package Primer_trimestre.Tema_2.Pruebas;

import java.util.Scanner;

public class ArraysNombresYTelefonos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];
        int[] telefonos = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Dime el nombre: ");
            nombres[i] = scanner.next();
            System.out.print("Y su telefono: ");
            telefonos[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + telefonos[i] );
        }


    }
}
