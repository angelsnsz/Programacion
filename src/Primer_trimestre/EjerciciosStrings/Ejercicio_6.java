package Primer_trimestre.EjerciciosStrings;

import java.awt.*;

/*
Crea un programa que descubra si una palabra es o no palíndroma, es decir se lee igual del derecho que del revés.

Introduciendo: “oso”

Da como salida: true
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        String palabra="Angel";
        palabra = palabra.toLowerCase();

        boolean esPalindromo = true;
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
            }
        }

        System.out.println(esPalindromo);
    }
}
