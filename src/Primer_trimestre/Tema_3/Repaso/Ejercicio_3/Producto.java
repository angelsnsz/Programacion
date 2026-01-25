package Primer_trimestre.Tema_3.Repaso.Ejercicio_3;


    public class Producto {

        private String nombre;
        private double precio;
        private int stock;

        // Constructor
        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        // Método vender
        public boolean vender(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
                return true;
            }
            return false;
        }

        // Método reponer
        public void reponer(int cantidad) {
            stock += cantidad;
        }

        // Mostrar información
        public void mostrarInfo() {
            System.out.printf(
                    "Producto: %s | Precio: %.2f € | Stock: %d unidades%n",
                    nombre, precio, stock
            );
        }
    }

