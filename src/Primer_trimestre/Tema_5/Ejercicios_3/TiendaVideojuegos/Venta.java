package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
   Clientes clientes;
   List<Videojuego> videojuegos;
   LocalDate fecha;

   static List<Venta> ventas= new ArrayList<>();

    public Venta(Clientes clientes, List<Videojuego> videojuegos, LocalDate fecha) {
        this.clientes = clientes;
        this.videojuegos = videojuegos;
        this.fecha = fecha;
        ventas.add(this);
        registrarVenta();
    }

    private void registrarVenta() {
        for (Videojuego v: videojuegos) {
            v.comprar();
        }
    }

    public static List<Venta> mostrarHistorialCompleto() {
        return ventas;
    }

    public static List<Venta> mostrarHistorialFecha(LocalDate fecha) {
        List<Venta> ventasFecha = new ArrayList<>();
        for (Venta v : ventas) {
            if (v.fecha.equals(fecha)) {
                ventasFecha.add(v);
            }
        }
        return ventasFecha;
    }
}
