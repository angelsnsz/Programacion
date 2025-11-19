package Primer_trimestre.Tema_2.EjerciciosRepaso;

import java.util.Scanner;

/*
Escribe un metodo para calcular el area de un rectangulo dados base y altura.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la base");
        double base = scanner.nextDouble();
        System.out.println("Escribe la altura");
        double altura = scanner.nextDouble();

        double areaRectangulo = calcularArea(base, altura);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
    }

    static double calcularArea(double base, double altura) {

        return base * altura;
    }
}
