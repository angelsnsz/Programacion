package Primer_trimestre.Tema_2.Ejercicios_3;

import java.util.Scanner;

/*
Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c),
teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b.
El proceso de descifrado es el contrario.
Los caracteres que no sean alfabéticos no registrarán ningún cambio.
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        String cadena=scanner.next();
        char caracter=cadena.charAt(0);

    }
}
