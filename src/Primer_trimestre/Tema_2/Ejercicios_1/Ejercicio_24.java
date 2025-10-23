package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;

/*
Pedir un número entre 0 y 9.999, decir si es capicúa.
 */
public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero= scanner.nextInt();
        if (numero <10 ){
            System.out.println("Tu numero es capicua");
        } else if (numero<100){
            int decenas = numero /10;
            int unidades = numero %10;
            if (decenas == unidades){
                System.out.println("Tu numero es capicua");
            }else {
                System.out.println("Tu numero no es capicua");
            }
        } else if (numero <1000){
            int centenas =numero /100;
            int unidades = numero %10;
            if (centenas==unidades){
                System.out.println("Tu numero es capicua");
            } else {
                System.out.println("Tu numero no es capicua");
            }
        } else if (numero <=9999){
            int millares = numero /1000;
            int centenas = (numero /100) %10;
            int decenas =(numero /10) %10;
            int unidades = numero %10;
            if (millares == unidades && centenas ==decenas){
                System.out.println("Tu numero es capicua");
            }else {
                System.out.println("Tu numero no es capicua");
            }
        }
        scanner.close();
    }
}
