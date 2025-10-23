package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Crea un programa que compruebe si un año es bisiesto.

“Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, terminado en «00»-,
en cuyo caso también ha de ser divisible entre 400.”
 */
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un año, por favor");
        int año = scanner.nextInt();
        String Resultado =((año % 4==0 && año% 100 !=0) || (año %400 ==0)) ? "El año " + año + " es bisiesto" :"El año " +año + " no es bisiesto ";
        System.out.println(Resultado);
        scanner.close();
    }
}
