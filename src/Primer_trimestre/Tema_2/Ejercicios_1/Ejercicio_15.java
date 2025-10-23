package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Mostrar la tabla de multiplicar de un número.
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        int numero = scanner.nextInt();
        for (int i=1 ; i <=10; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
