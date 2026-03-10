package Primer_trimestre.Tema_5.Ejercicios_4.Ejercicio1;

import java.util.HashSet;

/*
Ejercicio 1: El Control de Acceso Único (HashSet)
El objetivo es entender que un Set no permite duplicados.
Tarea: Crea un HashSet<String> llamado invitados.
Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".
Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> invitados=new HashSet<>();
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
        System.out.println(invitados);
    }
}