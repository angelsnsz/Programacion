package Primer_trimestre.Tema_6_Ficheros;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EjercicioNIO {
    public static void main(String[] args) {
        Path ruta= Paths.get("alumnos.txt");
        try{
            Files.write(ruta, List.of("Esteban"), StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo" + e.getMessage());
        }
    }
}
