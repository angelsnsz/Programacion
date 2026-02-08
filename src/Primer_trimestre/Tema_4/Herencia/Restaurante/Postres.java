package Primer_trimestre.Tema_4.Herencia.Restaurante;

public class Postres extends Plato{

    boolean conAzucar;

    public Postres(String nombre, double precio, boolean conAzucar) {
        super(nombre, precio);
        this.conAzucar = conAzucar;
    }

    public boolean getconAzucar() {
        return conAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + (conAzucar ? ", es con azúcar" : ", es sin azúcar");
    }
}