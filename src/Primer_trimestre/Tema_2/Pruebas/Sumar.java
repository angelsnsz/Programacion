package Primer_trimestre.Tema_2.Pruebas;

/*
Define un metodo sumar que reciba dos enteros y retorne su suma.
 */
public class Sumar {
    public static void main(String[] args) {
        int suma = sumar(1, 2);
        System.out.println(suma);
    }

    static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
