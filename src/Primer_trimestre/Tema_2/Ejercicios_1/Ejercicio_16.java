package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Desarrolla un programa que dado el día y mes de nacimiento te indique cuáles tu signo del zodiaco.
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu dia de nacimiento, por favor: ");
        int dia = scanner.nextInt();
        System.out.println("Escribe tu mes de nacimiento en numero, por favor:");
        int mes = scanner.nextInt();
        if (mes == 1) {
            if (dia >= 20)
                System.out.println("Tu signo es Acuario");
            else
                System.out.println("Tu signo es Capricornio");
            } else if (mes ==2){
            if (dia >=19)
                System.out.println("Tu signo es Piscis");
            else
                System.out.println("Tu signo es Acuario");
        } else if (mes == 3 ) {
            if (dia >= 20)
                System.out.println("Tu signo es Aries");
            else
                System.out.println("Tu signo es Piscis");
        } else if (mes == 4) {
            if (dia >=20)
                System.out.println("Tu signo es Tauro");
            else
                System.out.println("Tu signo es Aries");
        } else if (mes == 5) {
            if (dia >=21)
                System.out.println("Tu signo es Géminis");
            else
                System.out.println("Tu signo es Tauro");
        } else if (mes == 6){
            if (dia >=21)
                System.out.println("Tu signo es Cáncer");
            else
                System.out.println("Tu signo es Géminis");
        } else if (mes == 7){
            if (dia >=23)
                System.out.println("Tu signo es Leo");
            else
                System.out.println("Tu signo es Cáncer");
        } else if (mes == 8){
            if (dia >=23)
                System.out.println("Tu signo es Virgo");
            else
                System.out.println("Tu signo es Leo");
        } else if (mes ==9){
            if (dia >=23)
                System.out.println("Tu signo es Libra");
            else
                System.out.println("Tu signo es Virgo");
        } else if (mes == 10){
            if (dia >=23)
                System.out.println("Tu signo es Escorpio");
            else
                System.out.println("Tu signo es Libra");
        } else if (mes ==11){
            if (dia >=22)
                System.out.println("Tu signo es Sagitario");
            else
                System.out.println("Tu signo es Escorpio");
        } else if (mes ==12) {
            if (dia >=22)
                System.out.println("Tu signo es Capricornio");
            else
                System.out.println("Tu signo es Escorpio");
        }
        scanner.close();
    }
}
