package Primer_trimestre.Tema_6_Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Escribe el nombre de un archivo");
        Scanner sc= new Scanner(System.in);
        String nombre= sc.next();
        sc.close();

        try {
            File fichero = new File(nombre);
            if (!fichero.exists()) fichero.createNewFile();

            try (BufferedWriter bw= new BufferedWriter(new FileWriter(fichero))){
                System.out.println("Escribe una linea");
                bw.write(sc.next());
                bw.newLine();
                bw.write(sc.next());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo" + e.getMessage());;
        }

    }
}
