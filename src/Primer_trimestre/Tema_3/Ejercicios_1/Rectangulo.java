package Primer_trimestre.Tema_3.Ejercicios_1;
/*
Escribe una clase llamada Rectángulo que posea dos atributos de tipo entero llamados largo y ancho.
La clase debe poseer los siguientes métodos:
- Un metodo constructor que no reciba ningún parámetro y que inicialice las dimensiones del rectángulo (largo y ancho) con dos enteros positivos por defecto.
- Otro metodo constructor que reciba el ancho y el largo como parámetros. Se debe chequear que ambos valores sean positivos antes de asignárselos a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.
- Métodos get y set para la clase. Los métodos set deben chequear que las nuevas dimensiones efectivamente sean enteros positivos.
- Un metodo que calcule y retorne el área del rectángulo.
- Metodo que calcule y retorne el perímetro del rectángulo.
- Otro metodo que determine si el rectángulo es horizontal o vertical. Decimos que el rectángulo es horizontal si el valor del largo es mayor que el del ancho. En caso contrario, decimos que el rectángulo es vertical.
- Un metodo que despliegue en pantalla los valores de las dimensiones (largo y ancho) del rectángulo.
- Otro metodo que dibuje en pantalla el rectángulo mediante asteriscos, utilizando tantas columnas como valor tenga el largo y tantas filas como valor tenga el ancho. Por ejemplo, si el ancho valiera 3 y el largo valiera 12, se debería desplegar así:
 */
public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        if (largo > 0 && ancho > 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo = 7;
            this.ancho = 3;
        }
    }
    public Rectangulo() {
        this(7, 3);
    }


    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int calcularArea() {
        return largo * ancho;
    }

    public int calcularPerimetro() {
        return (largo + ancho) * 2;
    }

    public void orientacion() {
        if (largo > ancho) {
            System.out.println("El rectangulo es horizontal");
        } else if (largo < ancho) {
            System.out.println("El rectangulo es vertical");
        } else {
            System.out.println("El rectangulo es un cuadrado");
        }
    }

    public void dibujar() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String mostrarValores() {
        return "largo: " + largo + " \\ ancho: " + ancho;
    }
}
