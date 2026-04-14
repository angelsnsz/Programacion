package Primer_trimestre.Tema_6_Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Escribe el nombre de un archivo");
        Scanner sc= new Scanner(System.in);
        String nombre= sc.next();
        sc.close();

        try {
            File fichero = new File(nombre);
            if (!fichero.exists()) fichero.createNewFile();
            else System.out.println(fichero.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al crear el archivo" + e.getMessage());;
        }
    }
}
