package Primer_trimestre.Tema_3.Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Alumno {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Alumno [] clase= new Alumno[3];

        for (int i = 0; i < clase.length; i++) {
            System.out.println("Introduce un nombre");
            String n= scanner.nextLine();
            System.out.println("Introduce la nota");
            double nota= scanner.nextDouble();
            clase[i]= new Alumno(n,nota);

            if (nota < 5){
                System.out.println("Le quieres aprobar? s/n");
                String s1= scanner.nextLine();
                if ("s".equals(s1)){
                    clase[i].aprobar();
                }
                else {
                    System.out.println("Pues se queda suspenso");
                }
            }
        }
        System.out.println("Imprimimos todo el array ::::::::");
        System.out.println(Arrays.toString(clase));
    }
}
