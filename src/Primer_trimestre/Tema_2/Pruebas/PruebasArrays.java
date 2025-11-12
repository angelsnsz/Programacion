package Primer_trimestre.Tema_2.Pruebas;

import java.util.Arrays;

public class PruebasArrays {
    public static void main(String[] args) {
        int[] notasAngel=new int[3];
        notasAngel[0]=2;
        notasAngel[1]=5;
        notasAngel[2]=9;
        System.out.println(Arrays.toString(notasAngel));
        int[]notasAngelauxiliares=notasAngel;
        notasAngel =new int[4];
       for (int i=0; i < 3; i++){
           notasAngel[i]=notasAngelauxiliares[i];
       }
    }
}
