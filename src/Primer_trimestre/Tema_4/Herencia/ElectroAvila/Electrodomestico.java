package Primer_trimestre.Tema_4.Herencia.ElectroAvila;

public abstract class Electrodomestico {
    int precioBase;
    String color;
    char consumoEnergetico;
    double peso;

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    public String registrarColor (String color){
        if (color.equals("Blanco,Negro,Rojo,Azul,Gris")){

        }else {
         return "Blanco";
        }
    }
    public char introducirConsumo(char consumoEnergetico){
        if (consumoEnergetico == 'A' | 'B'){

        }else {
            return 'F';
        }
    }

}
