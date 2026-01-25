package Primer_trimestre.Tema_3.Repaso.Ejercicio_1;

public class Alumno {
    //Atributos private
    private String nombre;
    private double nota;
    //Constructor
    public Alumno(String nombre, double nota){
        this.nombre= nombre;
        this.nota= nota;
    }
    public Alumno(){
        this("sin nombre",0);
    }
    public double aprobar(){
        if (nota < 5){
            nota = 5;
        }
        return nota;
    }
    public void imprimir(){
        System.out.println(nombre + " tiene de nota "+ nota);
    }
    public  String toString(){
        return  nombre + " tiene de nota " + nota;
    }
}
