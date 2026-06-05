package ExamenTema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    public List<Peonada> leerCSV(String fichero) {

        List<Peonada> lista = new ArrayList<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            Path ruta = Path.of(fichero);

            List<String> lineas = Files.readAllLines(ruta);

            for (int i = 1; i < lineas.size(); i++) {

                String linea = lineas.get(i);

                try {

                    String[] campos = linea.split(";");

                    if (campos.length != 4) {
                        throw new IllegalArgumentException();
                    }

                    LocalDate fecha = LocalDate.parse(campos[0], formato);
                    String nombre = campos[1];
                    String parque = campos[2];
                    int horas =
                            Integer.parseInt(campos[3]);

                    lista.add(
                            new Peonada(fecha,nombre, parque, horas)
                    );

                } catch (Exception e) {
                    System.out.println("Línea ignorada: " + linea);
                }
            }

        } catch (IOException e) {

            System.out.println("Error leyendo fichero: " + e.getMessage());
        }

        return lista;
    }
}
