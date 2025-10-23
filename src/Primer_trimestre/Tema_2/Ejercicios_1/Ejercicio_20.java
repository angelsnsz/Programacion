package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes,
 mostrando el resultado en pantalla.
 */
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor:");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i=1;i <numero + 100;i++){
            suma+=numero + i;
            System.out.println("sumamos" + i);
        }
        System.out.println("El total es :" + suma);
    }
}
