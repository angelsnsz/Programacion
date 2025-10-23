package Primer_trimestre.Tema_2.Ejercicios_1;
/*
Haz el mismo ejercicio anterior con otro bucle.
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        int i =1;
        while (i<=100){
            if (i%2==0 && i%3==0) {
                System.out.println(+i);
            }
            i++;
        }
    }
}
