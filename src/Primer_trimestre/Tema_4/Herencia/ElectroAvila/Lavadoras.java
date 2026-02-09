package Primer_trimestre.Tema_4.Herencia.ElectroAvila;

public class Lavadoras extends Electrodomestico{
    double carga;
    public Lavadoras(int precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga= carga;
    }
    public double reglaNegocio(double carga) {
        if (carga > 30) {
            return precioBase * 1.05;
        } else {
            return precioBase;
        }
    }
}
