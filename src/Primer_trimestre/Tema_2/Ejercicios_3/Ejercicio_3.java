package Primer_trimestre.Tema_2.Ejercicios_3;

import java.util.Scanner;

/*
Haz un metodo llamado esVocal(), al que se le pasa como parámetro un carácter y retorna un valor true en caso de que el
carácter sea una vocal, y un valor false en caso contrario.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un caracter:");
        char caracter= scanner.next().charAt(0);
        if (esVocal(caracter)) {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' NO es una vocal.");
        }
        scanner.close();
    }
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);

        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

}
