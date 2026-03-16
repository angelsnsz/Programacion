package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.util.UUID;

public class Videojuego {
    String titulo;
    String plataforma;
    String genero;
    double precio;
    int stock;
    UUID uuid;

    public Videojuego(String titulo, String plataforma, String genero, double precio, int stock, UUID uuid) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.uuid = uuid;
    }
    public void generaruuid(){
        if (uuid == null){

        }

    }

}
