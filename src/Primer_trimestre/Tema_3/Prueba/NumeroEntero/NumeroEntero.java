package Primer_trimestre.Tema_3.Prueba.NumeroEntero;

public class NumeroEntero {

    private int valor;

    // Constructor que recibe un entero decimal
    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    // Constructor que recibe un String y una base
    public NumeroEntero(String valor, int base) {
        this.valor = Integer.parseInt(valor, base);
    }

    // Devuelve el valor en decimal
    public String getDecimal() {
        return Integer.toString(valor);
    }

    // Devuelve el valor en binario
    public String getBinario() {
        return Integer.toBinaryString(valor);
    }

    // Devuelve el valor en octal
    public String getOctal() {
        return Integer.toOctalString(valor);
    }

    // Devuelve el valor en hexadecimal
    public String getHexadecimal() {
        return Integer.toHexString(valor);
    }
}
