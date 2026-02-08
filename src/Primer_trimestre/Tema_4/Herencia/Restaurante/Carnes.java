package Primer_trimestre.Tema_4.Herencia.Restaurante;

public class Carnes extends Plato{

    String coccion;

    public Carnes(String nombre, double precio, String coccion) {
        super(nombre, precio);
        this.coccion = coccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", punto de coccion: " + coccion;
    }
}
