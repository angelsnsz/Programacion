package Primer_trimestre.Tema_6_Ficheros.Ejercicios_2;
/*
El ayuntamiento de Toledo contrata a varios empleados para realizar la limpieza de parques y jardines de la ciudad. El capataz de la cuadrilla de limpieza anota cada día en un archivo los trabajadores que han acudido al trabajo, a fin de realizar al final de mes un informe con las jornadas de trabajo que hay que pagarle a cada empleado. El archivo donde el capataz realiza las anotaciones se llama peonadas.txt y contiene el formato:

Fecha;Nombre1;Nombre2;Nombre3

Debemos procesar el fichero y:
Crear una carpeta con cada año.
Dentro de cada año crear un fichero para cada trabajador llamado nombre_año_peonadas.txt
Dentro de este fichero habrá un listado de meses, por ejemplo:
Enero 6
Febrero 4
Marzo 7
Abril 3
Mayo 0
Junio 0
Julio 0
Agosto 0
Septiembre 17
Octubre 4
Noviembre 8
Diciembre 12

Así, quedaría por ejemplo:

2025
Juan_Luis_Gomez_peonadas.txt
Marta_Gonzalez_peonadas.txt
2024
...
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Peonadas {
    public static void main(String[] args) {

        Path peonadas = Paths.get("src/Primer_trimestre/Tema_6_Ficheros/ejercicios_2/peonadas.txt");
        Map<String, Map<String, int[]>> datos = new HashMap<>();

        try (Scanner sc = new  Scanner(peonadas)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");
                String fecha = partes[0];

                String[] partesFecha = fecha.split("/");
                String anio = partesFecha[2];
                int mes = Integer.parseInt(partesFecha[1]) - 1;

                datos.putIfAbsent(anio, new HashMap<>());

                for (int i = 1; i < partes.length; i++) {
                    String trabajador = partes[i];
                    datos.get(anio).putIfAbsent(trabajador, new int[12]);
                    datos.get(anio).get(trabajador)[mes]++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error, " + e.getMessage());
        }

        try {
            for (String anio: datos.keySet() ) {
                Path rutaAnio = Paths.get("src/Primer_trimestre/Tema_6_Ficheros/ejercicios_2/peonadas/" + anio);
                Files.createDirectories(rutaAnio);

                for (String trabajador: datos.get(anio).keySet() ) {
                    String nombreTrabajador = trabajador.replace(" ", "_");
                    String nombreFichero = nombreTrabajador + "_" + anio + "_peonadas.txt";

                    Path fichero = Paths.get(rutaAnio + "/" + nombreFichero);
                    Files.createFile(fichero);

                    int[] meses = datos.get(anio).get(trabajador);
                    String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

                    List<String> lineasFichero = new ArrayList<>();
                    for (int i = 0; i < 12; i++) {
                        lineasFichero.add(nombresMeses[i] + " " + meses[i]);
                    }
                    Files.write(fichero, lineasFichero);
                }
            }
            System.out.println("Completado ");
        } catch (IOException e) {
            System.err.println("Error, " + e.getMessage());
        }


    }
}
