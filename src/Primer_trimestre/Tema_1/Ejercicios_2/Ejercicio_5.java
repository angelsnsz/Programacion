package Primer_trimestre.Tema_1.Ejercicios_2;
/*
Escribe un programa para que muestre tu dirección y tu número de teléfono.
 Asegúrate de que los datos se muestran en líneas separadas.
 */
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu direccion, por favor");
        String direccion = scanner.nextLine();
        System.out.println("Escribe tu numero de telefono, por favor");
        int numero = scanner.nextInt();

        System.out.println("Tu direccion es " + direccion + "\n" + "Tu numero de telefono es " + numero);
    }
}
