package Primer_trimestre.EXTRA.Ejer_4EstadisticaNumeros;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
Crea una lista con los números: {10, 20, 30, 40, 50}.
Calcular la suma y el promedio de todos los números.
Convierte el stream a un IntStream usando .mapToInt(n -> n) y utiliza los métodos .sum() y .average().
 */
public class Ejercicio_4 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        int suma = numeros.stream().mapToInt(Integer::intValue).sum();

        OptionalDouble media = numeros.stream().mapToInt(Integer::intValue).average();

        System.out.println("suma :: "+suma);
        System.out.println("media :: "+media.getAsDouble());
    }
}
