package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tienda {
    List<Cliente>clientes=new ArrayList<>();
    List<Videojuego> inventario=new ArrayList<>();
    List<Venta> ventas =new ArrayList<>();


    public void addVideojuego(Videojuego v) {
        inventario.add(v);
    }


    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("Inventario vacío");
            return;
        }

        for (int i = 0; i < inventario.size(); i++) {
            Videojuego v = inventario.get(i);
            System.out.println(v);
        }
    }

    public Videojuego buscarPorId(UUID uuid) {
        for (Videojuego v : inventario) {
            if (v.getId().equals(uuid)) return v;
        }
        return null;
    }


    public Videojuego buscarPorTitulo(String titulo) {
        for (Videojuego v : inventario) {
            if (v.getTitulo().equalsIgnoreCase(titulo)) return v;
        }
        return null;
    }


    public int consultarStock(String titulo) {
        Videojuego v = buscarPorTitulo(titulo);
        return (v != null) ? v.getStock() : -1;
    }


    public Cliente buscarCliente(String dato) {
        for (Cliente c : clientes) {
            if (String.valueOf(c.getCod()).equals(dato) ||
                    c.getNombre().equalsIgnoreCase(dato) ||
                    c.getApellidos().equalsIgnoreCase(dato) ||
                    c.getEmail().equalsIgnoreCase(dato)) {
                return c;
            }
        }
        return null;
    }


    public void registrarVenta(Cliente clientes, List<Videojuego> juegos) {
        for (Videojuego v : juegos) {
            if (v.getStock() > 0) {
                v.reducirStock(1);
            } else {
                System.out.println("Sin stock: " + v.getTitulo());
                return;
            }
        }

        ventas.add(new Venta(clientes, juegos,LocalDate.now()));
    }


    public void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas");
            return;
        }

        for (int i = 0; i < ventas.size(); i++) {
            Venta v = ventas.get(i);
            System.out.println(v);
        }
    }


    public void mostrarVentasPorFecha(LocalDate fecha) {
        for (Venta v : ventas) {
            if (v.getFecha().equals(fecha)) {
                System.out.println(v);
            }
        }
    }
}
