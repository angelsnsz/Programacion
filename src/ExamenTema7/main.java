package ExamenTema7;

import java.util.List;

public class main {
    public static void main(String[] args) {

        LectorCSV lector = new LectorCSV();

        List<Peonada> peonadas = lector.leerCSV("peonadas.csv");

        System.out.println("Registros cargados:" + peonadas.size());

        PeonadaDAO dao = new PeonadaDAO();

        dao.insertarPeonadas(peonadas);

        List<ResumenEmpleado> resumen = dao.obtenerResumen();

        EscritorInforme escritor = new EscritorInforme();

        escritor.generarInforme(resumen, "informe.txt");

        System.out.println("Informe generado correctamente.");
    }
}
