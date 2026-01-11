package Primer_trimestre.EjerciciosStrings;
/*
Desarrolla un programa que rote una cadena tantas veces como se le indique.

Introduciendo: “Lunes”

Rotaciones: 3

Da como salida: “nesLu”
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        String texto= "Lunes";
        int rotaciones = 3;

        char[] caracteres = texto.toCharArray();

        for (int r = 0; r < rotaciones - 1; r++) {
            char primera = caracteres[0];
            for (int i = 0; i < caracteres.length - 1; i++) {
                caracteres[i] = caracteres[i + 1];
            }
            caracteres[caracteres.length - 1] = primera;
        }

        String resultado = new String(caracteres);
        System.out.println(resultado);
    }
}
