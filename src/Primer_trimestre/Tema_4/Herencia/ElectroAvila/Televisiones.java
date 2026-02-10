package Primer_trimestre.Tema_4.Herencia.ElectroAvila;

public class Televisiones extends Electrodomestico{
    int tamanio;
    boolean esOLED;

    public Televisiones(int precioBase, String color, char consumoEnergetico, double peso, int tamanio,boolean esOLED) {
        super(precioBase, color, consumoEnergetico, peso);
        this.tamanio=tamanio;
        this.esOLED=esOLED;
    }
    public double reglaNegocioA (int tamanio){
        if (tamanio>60){
            return precioBase * 1.30;
        }else {
            return precioBase;
        }
    }
    public double reglaNegocioB (boolean esOLED){
        if (esOLED){
            return precioBase + 250;
        }else{
            return precioBase;
        }
    }
}
