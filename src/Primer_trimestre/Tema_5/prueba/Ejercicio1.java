package Primer_trimestre.Tema_5.prueba;

import java.util.ArrayList;
import java.util.List;
/*
Ejercicio 1: Operaciones Básicas con Alumnos

Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.

Añade cinco nombres a la lista.

Inserta un nombre nuevo en la tercera posición (índice 2).

Muestra el tamaño actual de la lista utilizando el atributo o método correspondiente.

Elimina al alumno que esté en la última posición.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Humberto");
        alumnos.add("Pablo");
        alumnos.add("Omar");
        alumnos.add("Daniel");
        alumnos.add("Ruben");
        alumnos.add(2, "Gabriel");
        System.out.println("Tamaño:" + alumnos.size());
        alumnos.removeLast();
    }
}