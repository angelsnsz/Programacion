package Primer_trimestre.Tema_2.Pruebas;

import java.util.Arrays;

public class PruebaArrays {
    public static void main(String[] args) {
        int notaPrimerExamenANGEL = 7;
        int notaSegundoExamenANGEL = 6;

        int[] notasAngel = new int[3];
        notasAngel[0] = 7;
        notasAngel[1] = 9;
        notasAngel[2] = 4;
        System.out.println(Arrays.toString(notasAngel));
        int[] notasAngelAuxiliares = notasAngel;
        notasAngel = new int[4];
        // Copiamos los valores
        for (int i = 0; i < notasAngelAuxiliares.length; i++) {
            notasAngel[i] = notasAngelAuxiliares[i];
        }
        notasAngel[3] = 9;
        System.out.println("notasAngel :: " + Arrays.toString(notasAngel));
        System.out.println("notasAngelAuxiliares :: " + Arrays.toString(notasAngelAuxiliares));
    }
}
