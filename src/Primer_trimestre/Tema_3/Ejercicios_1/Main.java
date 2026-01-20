package Primer_trimestre.Tema_3.Ejercicios_1;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 9);
        Rectangulo r2 = new Rectangulo();
        Rectangulo r3 = new Rectangulo(7, 5);


        System.out.println(r1.mostrarValores());
        System.out.println(r2.mostrarValores());
        System.out.println(r3.mostrarValores());

        r1.orientacion();
        r2.orientacion();
        r3.orientacion();

        System.out.println(r1.calcularArea());
        System.out.println(r2.calcularArea());
        System.out.println(r3.calcularArea());

        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularPerimetro());
        System.out.println(r3.calcularPerimetro());

        r3.dibujar();
    }
}
