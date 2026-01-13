package Primer_trimestre.Tema_3.Ejercicios_3;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre,String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public String mostrarAutor(){
        return nombre +" (nacionalidad: " + nacionalidad +")";
    }
}
