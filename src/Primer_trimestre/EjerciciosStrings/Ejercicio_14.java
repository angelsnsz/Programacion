package Primer_trimestre.EjerciciosStrings;

import java.util.Scanner;

/*
 Implementa un programa que intercale las letras de dos palabras.
 El programa debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las dos palabras intercaladas.

Introduciendo:
Primera palabra “INTERNET”

Segunda palabra “correo”

Da como salida: “IcNoTrErReNoET”
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra para combinar: ");
        String primeraPalabra = sc.nextLine();
        System.out.println("Introduce la segunda palabra para combinar: ");
        String segundaPalabra = sc.nextLine();
        sc.close();

        StringBuilder resultado = new StringBuilder();
        int longitudMax = Math.max(primeraPalabra.length(), segundaPalabra.length());

        for (int i = 0; i < longitudMax; i++) {

            if (i < primeraPalabra.length()) {
                resultado.append(primeraPalabra.charAt(i));
            }
            if (i < segundaPalabra.length()) {
                resultado.append(segundaPalabra.charAt(i));
            }
        }
        System.out.println("La palabra combinada es: " + resultado);

    }
}
