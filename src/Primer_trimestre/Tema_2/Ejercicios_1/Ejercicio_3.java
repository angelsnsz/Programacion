package Primer_trimestre.Tema_2.Ejercicios_1;
import java.util.Scanner;
/*
Desarrolla un programa que, dado un número entre el 1 y el 7, indique el día de la semana del que se trata.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7 :");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Tu numero corresponde con el lunes");
                break;
            case 2:
                System.out.println("Tu numero corresponde con el martes");
                break;
            case 3:
                System.out.println("Tu numero corresponde con el miercoles");
                break;
            case 4:
                System.out.println("Tu numero corresponde con el jueves");
                break;
            case 5:
                System.out.println("Tu numero corresponde con el viernes");
                break;
            case 6:
                System.out.println("Tu numero corresponde con el sabado");
                break;
            case 7:
                System.out.println("Tu numero corresponde con el domingo");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.close();
    }
}
