package Primer_trimestre.EjerciciosStrings;
/*
Desarrolla una solución que elimine todas las vocales de una frase.

Introduciendo: “Hola a Todos”

Da como salida: “Hl Tds”
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        String frase = "Hola a Todos";
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Comprobamos si c NO es vocal
            if ("aeiouAEIOU".indexOf(c) == -1) {
                resultado += c; // agregamos el carácter a la nueva frase
            }
        }

        System.out.println(resultado);
    }
}
