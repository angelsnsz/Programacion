package ExamenTema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EscritorInforme {

    public void generarInforme(
            List<ResumenEmpleado> lista, String fichero) {

        List<String> lineas = new ArrayList<>();

        lineas.add("==========================================");

        lineas.add("INFORME DE PEONADAS - AYUNTAMIENTO DE TOLEDO");

        lineas.add(
                "Fecha de generación: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );

        lineas.add("==========================================");

        lineas.add("");

        lineas.add("Empleado\tJornadas\tTotal horas");

        lineas.add("------------------------------------------------");

        int totalHoras = 0;

        for (ResumenEmpleado r : lista) {

            lineas.add(r.getNombreEmpleado() + "\t" + r.getJornadas() + "\t" + r.getTotalHoras());

            totalHoras += r.getTotalHoras();
        }

        lineas.add("------------------------------------------------");

        lineas.add("Total empleados: " + lista.size());

        lineas.add("Total horas globales: " + totalHoras);

        lineas.add("==========================================");

        try {

            Path ruta = Path.of(fichero);

            Files.write(ruta, lineas);

        } catch (IOException e) {

            System.out.println("Error escribiendo informe: " + e.getMessage());
        }
    }
}
