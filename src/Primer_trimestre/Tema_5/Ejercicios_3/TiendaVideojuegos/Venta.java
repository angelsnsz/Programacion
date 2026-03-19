package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.List;

public class Venta {
   Cliente clientes;
   List<Videojuego> videojuegos;
   LocalDate fecha;

    public Venta(Cliente clientes, List<Videojuego> videojuegos, LocalDate fecha) {
        this.clientes = clientes;
        this.videojuegos = videojuegos;
        this.fecha = fecha;
    }

    public LocalDate getFecha() { return fecha; }
}
