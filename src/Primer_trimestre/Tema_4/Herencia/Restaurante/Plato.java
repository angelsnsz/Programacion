package Primer_trimestre.Tema_4.Herencia.Restaurante;

public abstract class Plato {

    String nombre;
    double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "El plato " + nombre + ", cuesta " + precio;
    }
}
