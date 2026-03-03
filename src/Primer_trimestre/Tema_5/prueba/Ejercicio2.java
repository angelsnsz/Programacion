package Primer_trimestre.Tema_5.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Ejercicio 2: Búsqueda y Modificación

Utilizando la lista del ejercicio anterior:

Pide un nombre por teclado y comprueba si el alumno existe en la lista.

Si existe, modifica su nombre para que aparezca todo en mayúsculas.

Muestra la lista completa utilizando un bucle for-each.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List <String> alumnos = new ArrayList<>();
        alumnos.add("Humberto");
        alumnos.add("Pablo");
        alumnos.add("Omar");
        alumnos.add("Daniel");
        alumnos.add("Ruben");
        alumnos.add(2,"Gabriel");
        System.out.println("Tamaño:" + alumnos.size() );
        alumnos.removeLast();

        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nombre=sc.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.contains(nombre)){
                nombre.toUpperCase();
            }
        }

        for (String alumno:alumnos){
            System.out.println(alumno);
        }

    }
}