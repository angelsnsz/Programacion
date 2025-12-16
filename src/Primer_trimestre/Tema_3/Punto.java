/*
Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano.
Defina un metodo que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos.

Para probar esta funcionalidad, escriba un metodo main en el que se creen dos puntos,
el primero de los cuales deberá tener las coordenadas (100, 200) y
 el segundo deberá tener las coordenadas (400, 800) y calcule e imprima la distancia entre ambos.
 */
package Primer_trimestre.Tema_3;

public class Punto {
    int x;
    int y;
    public Punto(int x, int y) {
        this.x = x;
        this.y= y;
    }

    @Override
    public String toString() {
        return "Punto (" + x + "," + y +")";
    }

    public double calcularDistancia(Punto otroPunto){
        double distancia = Math.sqrt(Math.pow(this.x- otroPunto.x ,2) + Math.pow(this.y - otroPunto.y,2));
        return distancia;
    }


}

