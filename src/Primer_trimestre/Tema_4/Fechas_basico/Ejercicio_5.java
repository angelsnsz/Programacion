package Primer_trimestre.Tema_4.Fechas_basico;

import java.util.Scanner;

/*
Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de clases: ");
        int clases = sc.nextInt();

        int totalMinutos = 0;

        for (int i = 1; i <= clases; i++) {
            System.out.print("Duración de la clase " + i + " (en minutos): ");
            totalMinutos += sc.nextInt();
        }

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("Duración total: " + horas + " horas y " + minutos + " minutos");
    }
}
