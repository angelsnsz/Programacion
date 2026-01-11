package Primer_trimestre.EjerciciosStrings;

/*
Igual al anterior pero sumando los números completos.

Introduciendo: “15 de Noviembre de 2012”

Da como salida: 2027
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        String texto = "15 de Noviembre de 2012";
        String[] palabras = texto.split(" ");
        int suma = 0;

        for (String palabra : palabras) {
            // comprobamos si la palabra contiene solo dígitos
            if (palabra.matches("\\d+")) {
                suma += Integer.parseInt(palabra);
            }
        }

        System.out.println(suma);
    }
}
