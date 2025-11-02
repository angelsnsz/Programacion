package Primer_trimestre.Tema_2.Ejercicios_3;
/*
Realiza un metodo redondear() al que se le pasa como parámetro un numero float y los decimales que deben quedar después de redondear,
 y retorna el numero redondeado.
Ejemplo: redondear( 234.49234 , 3 )
Da como resultado : 234.492
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        float num = 234.49234f;
        int decimales = 3;

        float resultado = redondear(num, decimales);
        System.out.println("Resultado: " + resultado);
    }
    public static float redondear(float numero, int decimales) {
        float factor = (float) Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
