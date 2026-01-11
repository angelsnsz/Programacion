package Primer_trimestre.EjerciciosStrings;
/*
Desarrolla un programa que reciba una cadena y diga cuántas palabras contiene.
(Las palabras pueden estar separadas por espacios, puntos o comas).

Introduciendo: “Hola a todos. Adios”

Da como salida: 4
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        String cadena="Hola a todos. Adios";
        String texto = "Hola a todos.  hola y Adios";

        // Separar por espacios, puntos o comas
        String[] palabras = texto.split("[\\s.,]+");

        int contador = 0;
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contador++;
            }
        }

        System.out.println("Número de palabras: " + contador);
    }
}
