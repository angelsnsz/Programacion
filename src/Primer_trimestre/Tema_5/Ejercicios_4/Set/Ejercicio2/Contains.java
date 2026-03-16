package Primer_trimestre.Tema_5.Ejercicios_4.Set.Ejercicio2;

/*
Ejercicio 2: ¿Estás en la lista? (Uso de contains)
Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.
Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.
Acción: Pide al usuario por teclado un número usando Scanner.
Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Contains {
    public static void main(String[] args) {
        Set<Integer> ids= new HashSet<>();
        ids.add(4889);
        ids.add(5998);
        ids.add(8464);
        ids.add(9364);
        ids.add(1025);

        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un numero de 5 digitos:");
        int numero= sc.nextInt();
        sc.close();
        boolean acceso= ids.contains(numero);
        System.out.println(acceso);


    }
}
