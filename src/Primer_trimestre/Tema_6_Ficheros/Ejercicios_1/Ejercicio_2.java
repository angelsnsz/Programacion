package Primer_trimestre.Tema_6_Ficheros.Ejercicios_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 2: El Diario de Clase (Escritura de Texto Plano)
Objetivo: Practicar la escritura de texto añadiendo contenido al final del archivo (append).

Tarea: Crea un programa que funcione como un diario. Debe pedir al usuario por consola que introduzca frases.

Acción:
1. Cada frase introducida se debe guardar en un archivo llamado diario.txt.
2. El programa debe seguir pidiendo frases hasta que el usuario escriba la palabra "FIN".
3. Asegúrate de que si ejecutas el programa dos veces,
 las frases nuevas se añadan debajo de las antiguas sin borrar las anteriores (modo append).
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Path ruta= Paths.get("diario.txt");
        System.out.println("escribe");
        List<String> cosas = new ArrayList<>();
        do {
            cosas.add(sc.nextLine());
            System.err.println(cosas);
        }while(!cosas.getLast().equalsIgnoreCase("fin"));
        cosas.removeLast();
        try {
            Files.write(ruta, cosas, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("ERROR: El archivo no funciona" + e.getMessage());
        }
        sc.close();
    }
}
