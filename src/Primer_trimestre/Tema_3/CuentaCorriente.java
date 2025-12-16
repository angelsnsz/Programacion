package Primer_trimestre.Tema_3;

public class CuentaCorriente {
    double saldo;
    double cantidad;

    public CuentaCorriente(double saldo, double cantidad) {
        this.saldo = saldo;
        this.cantidad=cantidad;
    }

    public double mostrarSaldo(double saldo){
        return saldo;
    }

    public double imposicion(double saldo){
        return saldo+= cantidad;
    }

    public double reintegro(double saldo){
        return saldo -= cantidad;
    }
}
