package Primer_trimestre.Tema_5.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random r = new Random(50);

        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(50));
        }
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {

        }
    }
}
