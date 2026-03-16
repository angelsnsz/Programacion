package Primer_trimestre.Tema_5.Ejercicios_4.Set.Ejercicio3;


import java.util.TreeSet;

/*
Ejercicio 3: Ordenación de Premios (TreeSet)
Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).
Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.
Acción: Añade los números: 45, 12, 89, 3, 22.
Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.
 */
public class ejer3 {
    public static void main(String[] args) {
        TreeSet<Integer> premiados = new TreeSet<>();
        premiados.add(45);
        premiados.add(12);
        premiados.add(89);
        premiados.add(3);
        premiados.add(22);

        for (int premiado:premiados){
            System.out.println(premiado);
        }
    }
}
