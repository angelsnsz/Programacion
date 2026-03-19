package Primer_trimestre.Tema_5.Ejercicios_5.ElectroAvila;

public class Producto {
    private String id;
    private String modelo;
    private double precioBase;
    private int stock;

    public Producto(String id, String modelo, double precioBase, int stock) {
        this.id = id;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Getters y Setters básicos
    public String getId() { return id; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precio) { this.precioBase = precio; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Modelo: %-15s | Precio: %8.2f€ | Stock: %d",
                id, modelo, precioBase, stock);
    }

    // TODO: TAREA DEL ALUMNO
    // Implementar equals y hashCode basándose ÚNICAMENTE en el 'id'.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
    // Recordad que sin esto, el Set no detectará duplicados.
}
