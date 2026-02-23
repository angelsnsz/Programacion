package Primer_trimestre.Tema_4.Excepciones.Ejercicio3;

import java.util.Scanner;

public class PruebaConScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            int numero=scanner.nextInt();
            if (numero < 0){
                System.out.println("el numero no es positivo");
            }
        }finally {
            scanner.close();
        }
    }
}
