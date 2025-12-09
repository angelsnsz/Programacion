package Primer_trimestre.Repaso_Strings;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("escribe una palabra");
        String palabra=sc.nextLine();
        System.out.println("la longitud es:" + palabra.length());
        System.out.println("su primer caracter es :" + palabra.charAt(0));
        System.out.println("su ultimo caracter es :" + palabra.charAt(palabra.length()-1));
        System.out.println("contiene la letra a :" + (palabra.contains("a")? "si": "no"));
    }
}
