package Primer_trimestre.Tema_4.Herencia.Restaurante;

public class PlatoCarne extends Plato{

    String coccion;

    public PlatoCarne(String nombre, double precio, String coccion) {
        super(nombre, precio);
        this.coccion = coccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", punto de coccion: " + coccion;
    }
}
