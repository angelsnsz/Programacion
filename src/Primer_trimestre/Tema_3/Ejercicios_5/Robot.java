package Primer_trimestre.Tema_3.Ejercicios_5;

import java.util.Random;

public class Robot {
    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;

    public Robot(String nombre, String modelo){
        Random r=new Random();
        this.nombre=nombre;
        this.modelo=modelo;
        this.vida=100;
        this.potenciaAtaque=r.nextDouble(10,20);
        this.blindaje=r.nextDouble(0,10);
    }

    public void mostrarEstadisticas(){
        System.out.println();
    }
    public void recibirDano(){

    }
    public void atacar(){

    }
    public boolean estaVivo(){
        if (vida>0){
            return true;
        }else {
            return false;
        }
    }
}
