package Primer_trimestre.Tema_3.Ejercicios_4;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public NaveEspacial(String nombre, double capacidadCarga){
        this.nombre=nombre;
        this.capacidadCarga=capacidadCarga;
        enMision=false;
        combustible= 100;
    }
    public NaveEspacial(String nombre){
        this.nombre=nombre;
        capacidadCarga=6;
        enMision=false;
        combustible=100;
    }
    public void viajar(int distancia){
        if ((combustible - distancia * 2) <0){
            System.out.println("Combustible insuficiente para la misión");
        }
        else {
            enMision=true;
            combustible-=distancia * 2;
        }
    }
    public void repostar(){
        combustible=100;
        enMision=false;
    }
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " +nombre + " CapacidadCarga: " +capacidadCarga+ " Combustible: " + combustible+ " En Mision: " +enMision);
    }

    public int getCombustible() {
        return combustible;
    }
}
