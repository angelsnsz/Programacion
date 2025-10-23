package Primer_trimestre.Tema_2.Pruebas;

import java.util.Scanner;

/*
Escribe un metodo para calcular el area de un rectangulo dados la base y altura.
 */
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la base:");
        int base = scanner.nextInt();
        System.out.println("Escribe la altura:");
        int altura = scanner.nextInt();
        scanner.close();
        int area = calcularElArea(base, altura);
        System.out.println("El area es: " + area);
    }

    static int calcularElArea(int base, int altura) {
        return base * altura;
    }
}
