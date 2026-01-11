package Primer_trimestre.EjerciciosStrings;
/*
 Escribe un programa que lea un número en coma flotante de doble precisión,
  lo convierta a una cadena y le añada las comas separadoras de los miles.

Introduciendo: 2388432.34

Da como salida: 2,388,432.34
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        double numero=2388432.34;
        String resultado = String.format("%,.2f", numero);

        System.out.println(resultado);
    }
}
