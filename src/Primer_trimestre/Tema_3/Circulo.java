/*
Escribe una clase Java que represente un circulo. El circulo queda perfectamente definido si se conoce su radio. Defina ademas para esta clase dos metodos (publicos) que permitan calcular el area del circulo y el perimetro de la circunferencia que delimita el circulo. Para probar la funcionalidad antes definida, escriba un pequeño programa que cree un circulo con un radio dado, y que calcule y muestre por pantalla el area y el perimetro de su circunferencia.

 */
package Primer_trimestre.Tema_3;

public class Circulo {
   private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public String toString(){
        return "Un circulo de radio " + radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
