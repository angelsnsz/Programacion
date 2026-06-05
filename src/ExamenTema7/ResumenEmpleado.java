package ExamenTema7;

public class ResumenEmpleado {

    private String nombreEmpleado;
    private int jornadas;
    private int totalHoras;

    public ResumenEmpleado(String nombreEmpleado, int jornadas, int totalHoras) {
        this.nombreEmpleado = nombreEmpleado;
        this.jornadas = jornadas;
        this.totalHoras = totalHoras;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getJornadas() {
        return jornadas;
    }

    public int getTotalHoras() {
        return totalHoras;
    }
}
