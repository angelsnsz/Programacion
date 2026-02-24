package Primer_trimestre.Tema_4.Excepciones.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaConScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            int numero=scanner.nextInt();
            System.out.println(numero);
        }catch (InputMismatchException e){
            System.out.println("No has introducido un entero");
        }
        finally {
            scanner.close();
        }
    }
}
