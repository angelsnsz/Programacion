package Primer_trimestre.Tema_2.Ejercicios_1;
/*
Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).
 */
public class Ejercicio_18 {
    public static void main(String[] args) {
        long resultado=1;
        for (int i =1;i<=20;i++){
            resultado*=i;
        }
        System.out.println("resultado = "+resultado);
    }
}
