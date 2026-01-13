package Primer_trimestre.Tema_3.Ejercicios_3;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Miguel de Cervantes", "Española");
        Libro libro1= new Libro("Don Quijote", autor1);

        libro1.prestar();
        libro1.prestar();

        libro1.informacion();

    }
}
