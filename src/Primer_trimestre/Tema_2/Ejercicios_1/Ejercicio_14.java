package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Escribe un numero, por favor");
        int numero = scanner.nextInt();
        do  {
            System.out.println("Tu numero es igual o mayor que 0");
        }while (numero >= 0);
        if (numero < 0){
            System.out.println("Escribe ");
        }

    }
}
