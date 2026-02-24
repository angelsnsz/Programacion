package Primer_trimestre.Tema_4.Excepciones.Ejercicio5;

public class Registro {
    public void registrarEdad(int edad) throws EdadInvalidaException{
        if (edad < 0 || edad > 120){
            throw new EdadInvalidaException("La edad no es validad");
        }
        System.out.println("Edad registrada:" +edad);
    }
}