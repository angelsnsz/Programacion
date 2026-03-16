package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.time.LocalDate;

public class Venta {
    Clientes clientes;
    Videojuego videojuego;
    LocalDate fecha;

    public Venta(Clientes clientes, Videojuego videojuego, LocalDate fecha) {
        this.clientes = clientes;
        this.videojuego = videojuego;
        this.fecha = fecha;
    }

}
