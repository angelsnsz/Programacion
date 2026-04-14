package Primer_trimestre.EXTRA.Ejer2_TransformacionNombres;



import java.util.Arrays;
import java.util.List;

/*
Tenemos una lista de nombres de alumnos: {"ana", "luis", "guzmán", "marta"}.
 Convierte todos los nombres a mayúsculas.
Usa .stream().map(...) y luego recoge el resultado en una nueva List<String> usando .toList() (o Collectors.toList()).
Muestra la nueva lista por pantalla.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        List<String> nombres= Arrays.asList("ana", "luis", "guzmán", "marta");

        List<String>nombresMayuscula=nombres.stream().map(String::toUpperCase).toList();
        System.out.println(nombresMayuscula);
    }
}
