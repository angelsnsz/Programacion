package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
El IVA será una constante del 21%.
 */
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el precio de un producto, por favor: ");
        double precio = scanner.nextDouble();
        final double IVA = 0.21;
        double precioFinal = precio + (precio * IVA);
        System.out.println("El precio del producto con IVA es de: " + precioFinal);
    }
}
