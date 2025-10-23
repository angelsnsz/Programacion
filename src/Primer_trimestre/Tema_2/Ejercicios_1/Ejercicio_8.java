package Primer_trimestre.Tema_2.Ejercicios_1;
/*
Escribir un programa en Java que imprima por pantalla los números pares entre el 5 y el 15.000.
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        for (int i =5; i <=15000; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
