package Primer_trimestre.Tema_4.Repaso.EmpresaTransporte;

public class Burro implements Transportable {
    String nombre;
    double energiaRestante;
    double carga;

    public Burro(String nombre, double energiaRestante, double carga) {
        this.nombre = nombre;
        this.energiaRestante = energiaRestante;
        this.carga = carga;
    }

    public void descansar(){
        this.energiaRestante=100;
    }

    public void viajar(double distancia) {
        double consumo= distancia*3;
        this.energiaRestante-=consumo;
    }
}
