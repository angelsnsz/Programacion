package Primer_trimestre.Tema_3;

public class EjemploPunto {
    public static void main(String[] args) {
        Punto puntoA = new Punto(100, 200);
        Punto otroPunto =new Punto(400,800);
        double distancia = puntoA.calcularDistancia(otroPunto);
        System.out.println("La distacia seria: " +distancia);
    }
}
