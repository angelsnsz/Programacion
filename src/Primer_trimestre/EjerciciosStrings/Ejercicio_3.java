package Primer_trimestre.EjerciciosStrings;
/*
Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.

Introduciendo: “Lunes”

Da como salida: “Mvoft”
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        String texto = "Angel";
        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char) (caracteres[i] + 1);
        }

        String resultado = new String(caracteres);
        System.out.println(resultado);
    }
}
