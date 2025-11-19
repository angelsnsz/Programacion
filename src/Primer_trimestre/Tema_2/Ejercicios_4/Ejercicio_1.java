package Primer_trimestre.Tema_2.Ejercicios_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Crea un array de 20 elementos donde hay almacenados números enteros aleatorios (hasta 10).
 Haz un programa que pida un número y diga cuántas veces aparece el número dentro del array.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        System.out.println("Que número quieres comprobar? Del 1 al 10");
        int encontrar = scanner.nextInt();

        int veces = encontrarNumero(numeros, encontrar);

        String vezVeces = vezOVeces(veces);

        System.out.println("El número " + encontrar + " está " + veces + vezVeces);

    }

    static int encontrarNumero(int[] numeros, int encontrar) {
        int veces = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrar) {
                veces++;
            }
        }
        return veces;
    }

    static String vezOVeces(int veces) {
        if (veces == 1) {
            return " vez";
        } else {
            return " veces";
        }
    }


}
