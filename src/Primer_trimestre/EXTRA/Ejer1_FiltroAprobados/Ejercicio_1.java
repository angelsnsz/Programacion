package Primer_trimestre.EXTRA.Ejer1_FiltroAprobados;

import java.util.Arrays;
import java.util.List;

/*
Partimos de una lista de notas: List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);
Utiliza un Stream para filtrar las notas que sean mayores o iguales a 5.
Imprime cada nota aprobada utilizando el método .forEach() con una referencia a método o una lambda.
Resultado esperado: 8, 5, 10, 7.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);
       notas.stream().filter(n -> n >= 5).forEach(System.out::println);

    }


}
