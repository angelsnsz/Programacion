package Primer_trimestre.Tema_3.Repaso;

public class Movil {
    String marca;
    int bateria;
    boolean estaBloqueado;

    static void llamar(){
        System.out.println("Llamando.........");
    }
    public Movil(String marca, int bateria){
        this.marca=marca;
        this.bateria= bateria;
    }
    public Movil(){
        this("generico", 100);
    }
}

