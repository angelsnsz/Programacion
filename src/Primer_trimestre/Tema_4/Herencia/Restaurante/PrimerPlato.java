package Primer_trimestre.Tema_4.Herencia.Restaurante;

public class PrimerPlato extends Plato{

    boolean paraCompartir;

    public PrimerPlato(String nombre, double precio, boolean paraCompartir) {
        super(nombre, precio);
        this.paraCompartir = paraCompartir;
    }

    @Override
    public String toString() {
        return super.toString() + (paraCompartir ? ", es para compartir" : ", no es para compartir");
    }
}
