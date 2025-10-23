package Primer_trimestre.Tema_1.Ejercicios_3;
/*
Realiza un programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco.
Siempre calcularemos la mínima cantidad de billetes.
 */
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la cantidad de dinero que quiere sacar de su cuenta, por favor:");
        int dinero = scanner.nextInt();
        int resto = dinero;

        int bi500 =dinero /500;
        resto = dinero -500 * bi500;
        int bi200 = resto / 200;
        resto = resto - 200 * bi200;
        int bi100 = resto /100;
        resto =resto -100 * bi100;
        int bi50 = resto / 50;
        resto = resto -50 * bi50;
        int bi20= resto / 20;
        resto = resto -20 * bi20;
        int bi10= resto /10;
        resto = resto -10 * bi10;
        int bi5= resto /5;
        resto = resto -5 * bi5;
        System.out.println("Quiere sacar " + dinero+ "€" + "le vamos a dar \n" +bi500 + " billete/s de 500 \n" +bi200 + " billete/s de 200 \n" +bi100 + " billete/s de 100 \n" + bi50 + " billete/s de 50 \n" + bi20 + " billete/s de 20 \n" + bi10 + " billete/s de 10 \n" + bi5 + " billete/s de 5 \n");
        scanner.close();
    }
}
