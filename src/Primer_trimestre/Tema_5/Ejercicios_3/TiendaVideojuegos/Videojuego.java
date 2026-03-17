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

    static List<Videojuego> videojuegos = new ArrayList<>();
    public Videojuego(String titulo, String plataforma, String genero, double precio, int stock, UUID uuid) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.uuid = uuid;
    }

    private UUID generaruuid() {
        return UUID.randomUUID();
    }

    public List<Videojuego> mostrarInventario() {
        return videojuegos;
    }

    public static Videojuego buscarPorUUID(UUID id) {
        for (Videojuego v : videojuegos) {
            if (v.uuid == id) {
                return v;
            }
        }
        return null;
    }
    public static Videojuego buscarPorTitulo(String nombre) {
        for (Videojuego v : videojuegos) {
            if (v.titulo.equalsIgnoreCase(nombre)) {
                return v;
            }
        }

        return null;
    }

    public int getStock() {
        return stock;
    }

    public void comprar() {
        this.stock--;
    }
}
