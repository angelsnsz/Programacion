package Primer_trimestre.Tema_3.Repaso.Ejercicio_5;

public class Vehiculo {
        private String modelo;
        private double tarifaBase;
        private boolean esElectrico;
        private int diasAlquiler;

        // Constructor
        public Vehiculo(String modelo, double tarifaBase, boolean esElectrico, int diasAlquiler) {
            this.modelo = modelo;
            this.tarifaBase = tarifaBase;
            this.esElectrico = esElectrico;
            this.diasAlquiler = diasAlquiler;
        }

        public double calcularPrecioFinal(int edadConductor) {
            double total = tarifaBase * diasAlquiler;

            // Descuento por duración
            if (diasAlquiler > 15) {
                total *= 0.80;
            } else if (diasAlquiler > 7) {
                total *= 0.90;
            }

            // Bono ecológico
            if (esElectrico && total > 15) {
                total -= 15;
            }

            // Tasa joven
            if (edadConductor < 25) {
                total += 50;
            }

            return total;
        }

}
