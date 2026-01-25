package Primer_trimestre.Tema_3.Prueba;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;
    private boolean esFumador;
    private String estadoSalud;

    // Constructor
    public Persona(String nombre, int edad, boolean esFumador, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.esFumador = esFumador;
        this.estadoSalud = estadoSalud;
    }

    // Método para calcular el importe del seguro
    public double calcularImporteSeguro() {
        double importe = 500.0;

        // Edad
        if (edad < 25) {
            importe += importe * 0.20;
        } else if (edad > 40) {
            importe += importe * 0.10;
        }

        // Fumador
        if (esFumador) {
            importe += importe * 0.30;
        }

        // Estado de salud
        switch (estadoSalud.toLowerCase()) {
            case "excelente":
                importe -= importe * 0.10;
                break;
            case "bueno":
                // sin cambios
                break;
            case "regular":
                importe += importe * 0.15;
                break;
            case "malo":
                importe += importe * 0.30;
                break;
        }

        return importe;
    }
}

