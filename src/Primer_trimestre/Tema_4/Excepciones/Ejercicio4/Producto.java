package Primer_trimestre.Tema_4.Excepciones.Ejercicio4;

public class Producto {
    private double precio;

    public void establecerPrecio (double nuevoPrecio) throws ValorInvalidoException{
        if (nuevoPrecio<0){
            throw new ValorInvalidoException("El precio no es valido");
        }
        System.out.println("Precio valido:" + precio);
    }
}
