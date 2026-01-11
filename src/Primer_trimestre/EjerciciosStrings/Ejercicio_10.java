package Primer_trimestre.EjerciciosStrings;

import java.util.Scanner;

/*
 Desarrolla un programa que simule el juego del ahorcado. Elegimos una palabra y vamos pidiendo letras al usuario.
 Cada vez mostramos la palabra solo con las letras acertadas. Si no acierta todas las letras en 8 intentos,
  se da el juego por perdido.
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        String palabraSecreta = "palabra";
        int contadorIntentos = 0;
        int maxIntentos = 8;
        int letrasPorAdivinar = palabraSecreta.length();
        Scanner sc = new Scanner(System.in);

        char[] palabraParcial = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraParcial.length; i++) {
            palabraParcial[i] = '-';
        }

        while (contadorIntentos <= maxIntentos ) {

            System.out.println("Tu palabra hasta ahora: " + new String(palabraParcial));

            System.out.println("Introduce una letra: ");
            String input = sc.nextLine().toLowerCase();
            if (input.isEmpty()) {
                continue;
            }
            char letraPrueba = input.charAt(0);

            if (palabraSecreta.contains(String.valueOf(letraPrueba))) {
                System.out.println("La letra " + letraPrueba + " forma parte de la palabra secreta.");
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letraPrueba) {
                        if (palabraParcial[i] == '-') {
                            palabraParcial[i] = letraPrueba;
                            letrasPorAdivinar--;
                        }
                    }
                }
                contadorIntentos++;
                System.out.println("Llevas " + contadorIntentos + " de un total de 8 intentos.");

            } else {
                System.out.println("La letra " + letraPrueba + " NO forma parte de la palabra secreta.");
                contadorIntentos++;
                System.out.println("Llevas " + contadorIntentos + " de un total de 8 intentos.");
            }

        }
        if (letrasPorAdivinar == 0) {
            System.out.println("ENHORABUENA HAS GANADO. La palabra Secreta era: " + palabraSecreta);
        } else {
            System.out.println("Lo lamento. Has superado el número de intentos. La palabra secreta era: " + palabraSecreta);

        }
        sc.close();
    }
}
