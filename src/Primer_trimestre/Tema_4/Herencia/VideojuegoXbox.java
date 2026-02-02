package Primer_trimestre.Tema_4.Herencia;

public class VideojuegoXbox extends Videojuego{

    boolean necesitaGamepass;

    public VideojuegoXbox(String nombre, double precio,boolean necesitaGamepass){
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }

    public  String toString(){
        return nombre + "(" + precio + "€" ;
    }
}
