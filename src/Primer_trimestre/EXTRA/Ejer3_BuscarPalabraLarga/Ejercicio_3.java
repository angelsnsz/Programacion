package Primer_trimestre.EXTRA.Ejer3_BuscarPalabraLarga;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Dada una lista de palabras: {"Java", "Programación", "Stream", "Código", "DAM"}.
•Encuentra la palabra que tiene más caracteres.
•Pista: Usa el método .max() pasando un Comparator basado en la longitud de la cadena (String::length).
•Imprime la palabra encontrada (ten en cuenta que max devuelve un Optional).
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Java", "Programación", "Stream", "Código", "DAM");
        Optional<String> nombresConMasCaracteres = nombres.stream().max(Comparator.comparing(String::length));
        System.out.println(nombresConMasCaracteres);
    }
}
