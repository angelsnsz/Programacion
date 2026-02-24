package Primer_trimestre.Tema_4.Repaso.EmpresaTransporte;

public abstract class Vehiculo implements Transportable {
   protected String matricula;
   protected double kilometrosRecorridos;
   protected double combustibleRestante;

    public Vehiculo( double kilometrosRecorridos, double combustibleRestante) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.combustibleRestante = combustibleRestante;
    }

    public Vehiculo( String matricula,double kilometrosRecorridos, double combustibleRestante) {
        this(kilometrosRecorridos, combustibleRestante);
        this.matricula = matricula;
    }
}
