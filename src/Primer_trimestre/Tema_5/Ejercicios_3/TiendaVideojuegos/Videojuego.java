package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;
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
        this.uuid = UUID.randomUUID();
    }

    public UUID getId() { return uuid; }
    public String getTitulo() { return titulo; }
    public int getStock() { return stock; }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }
}
