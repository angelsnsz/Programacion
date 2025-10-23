package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Desarrolla un programa que indique el peso que tienes en la luna. Gravedad en la tierra 9,8 y en la luna 1,62.
 */
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Escribe tu peso, por favor");
        double peso=scanner.nextDouble();
        double peso_luna = peso *(1.62 / 9.8);
        System.out.println("Tu peso en la luna es " + peso_luna);
        scanner.close();
    }
}
