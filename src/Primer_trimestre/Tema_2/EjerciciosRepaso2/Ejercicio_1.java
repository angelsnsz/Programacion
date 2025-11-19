package Primer_trimestre.Tema_2.EjerciciosRepaso2;

import java.util.Scanner;

/*
Dado que es navidad, escribe un programa que,
introducido un número por teclado, dibuje la siguiente figura, por ejemplo, con el 5 tendrá 5 alturas:
El tronco tiene un palo de tronco por cada 5 niveles.
            *
           ***
          *****
         *******
        *********
            |
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("De cuantos niveles quieres el arbol?");
        int niveles= scanner.nextInt();
        for (int i=1;i<=niveles;i++){
            for (int j=1;j<=(2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        if (niveles>=5){
            System.out.println("|");
        }
    }
}
