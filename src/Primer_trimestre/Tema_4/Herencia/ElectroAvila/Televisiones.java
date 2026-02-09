package Primer_trimestre.Tema_4.Herencia.ElectroAvila;

public class Televisiones extends Electrodomestico{
    int tamanio;
    boolean sintonizadorTDT;
    String tipo;
    public Televisiones(int precioBase, String color, char consumoEnergetico, double peso, int tamanio,boolean sintonizadorTDT,String tipo) {
        super(precioBase, color, consumoEnergetico, peso);
        this.tamanio=tamanio;
        this.sintonizadorTDT=sintonizadorTDT;
        this.tipo=tipo;
    }
    public double reglaNegocioA (int tamanio){
        if (tamanio>60){
            return precioBase * 1.30;
        }else {
            return precioBase;
        }
    }
    public double reglaNegocioB (String tipo){
        if (tipo.equals("OLED")){
            return precioBase + 250;
        }else{
            return precioBase;
        }
    }
}
