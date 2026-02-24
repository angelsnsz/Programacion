package Primer_trimestre.Tema_4.Repaso.EmpresaTransporte;

public class Camion extends Vehiculo implements Transportable{
    private double cargaActual;
    private double capacidadMaxima;

    public Camion(double kilometrosRecorridos, double combustibleRestante, double cargaActual,double capacidadMaxima) {
        super(kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima=5000;
    }

    public Camion(String matricula, double kilometrosRecorridos, double combustibleRestante, double cargaActual, double capacidadMaxima) {
        super(matricula, kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }


    public void viajar(double distancia) {
        double consumo= 0.1*

    }
}
