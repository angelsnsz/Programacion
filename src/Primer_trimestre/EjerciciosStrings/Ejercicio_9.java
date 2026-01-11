package Primer_trimestre.EjerciciosStrings;

/*
   Escribe un programa que recibe dos cadenas de caracteres y comprueba cuantas veces aparece la primera en la segunda.

Introduciendo:               “la”

“La calle de la plaza”

Da como salida: 2
 */
public class Ejercicio_9 {
    public static void main(String[] args) {

        String buscar = "la";
        String texto = "La calle de la plaza";

        // Convertir a minúsculas
        buscar = buscar.toLowerCase();
        texto = texto.toLowerCase();

        // Usar split para contar
        String[] partes = texto.split(buscar);
        int veces = partes.length - 1;

        System.out.println(veces);
    }
}
