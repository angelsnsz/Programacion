package Primer_trimestre.Tema_4.Excepciones.Ejercicio5;

public class RegistroMain {
    public static void main(String[] args) throws EdadInvalidaException {
        Registro registro= new Registro();

        registro.registrarEdad(5);
        registro.registrarEdad(-8);
    }
}
