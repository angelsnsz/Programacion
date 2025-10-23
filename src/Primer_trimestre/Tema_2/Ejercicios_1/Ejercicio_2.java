package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Calcular el mayor de tres números enteros en Java.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escribe un numero, por favor: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe otro numero, por favor: ");
        int numero2 = scanner.nextInt();
        System.out.println("Escribe un tercer numero, por favor: ");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2){
            System.out.println("El mayor de los 3 es : " +numero1);
        } if (numero2 > numero3){
            System.out.println("El mayor de los 3 es : " +numero2);
        } if (numero3 > numero1){
            System.out.println("El mayor de los 3 es : " +numero3);
        } else {
            System.out.println("Todos los numeros son todos iguales");
        }
        scanner.close();
    }
}
