package Primer_trimestre.EjerciciosStrings;
/*
Implementa un programa que sume todas las cifras de los números que aparecen en una cadena de caracteres.

Introduciendo: “15 de Noviembre de 2012”

Da como salida: 11
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        String texto = "19 de Noviembre de 2022";
        int suma = 0;
        String digitos = "0123456789";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (digitos.indexOf(c) != -1) {  // si c está en "0123456789"
                suma += c - '0'; // convertir el carácter a número
            }
        }

        System.out.println(suma);
    }
}
