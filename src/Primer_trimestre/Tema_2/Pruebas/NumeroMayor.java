package Primer_trimestre.Tema_2.Pruebas;
/*

 */
public class NumeroMayor {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 3;

        int numeroMayor = maximo(a, b, c);
        System.out.println("El mayor es " + numeroMayor);
    }

    static int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

