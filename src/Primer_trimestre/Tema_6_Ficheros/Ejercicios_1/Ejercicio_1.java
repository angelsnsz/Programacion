package Primer_trimestre.Tema_6_Ficheros.Ejercicios_1;

import java.io.File;
import java.io.IOException;

/*
Ejercicio 1: El Explorador de Archivos (clase File o Files)
Objetivo: Comprender la navegación por el sistema de ficheros, la creación de directorios y la comprobación de existencia.

Tarea: Crea un programa que al iniciarse genere una carpeta llamada MiDirectorioDAM en la raíz del proyecto.

Acción:
1. Comprueba si la carpeta ya existe. Si no existe, créala.
2. Dentro de esa carpeta, crea dos archivos vacíos: datos.txt y config.ini.
3. Lista por consola el contenido de MiDirectorioDAM, mostrando el nombre de cada archivo y su tamaño en bytes.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        File carpeta= new File("MiDirectorioDAM");
        File datos= new File(carpeta,"datos.txt");
        File config= new File(carpeta,"config.ini");

        if (!carpeta.exists()) carpeta.mkdir();
            crearFichero(datos);
            crearFichero(config);

            File[] ficheros = carpeta.listFiles();

            for (File f : ficheros){
                System.out.println(f.getName() + ": " + f.length());
            }
    }
    public static void crearFichero(File file){
        try{
            if (!file.exists()) file.createNewFile();
        }catch (IOException e){
            System.out.println("Error al crear el fichero. " + e.getMessage());
        }
    }
}
