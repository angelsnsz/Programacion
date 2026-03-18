package Primer_trimestre.Tema_5.Ejercicios_3.TiendaVideojuegos;


import java.util.ArrayList;
import java.util.List;

public class Clientes {
    String nombre;
    String apellidos;
    String direccion;
    String email;
    int cod;

    static List<Clientes> clientes = new ArrayList<>();

    public Clientes(String nombre, String apellidos, String direccion, String email, int cod) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.cod = cod;
        clientes.add(this);
    }

    public static Clientes buscarPorCodigo(int cod) {
        for (Clientes c : clientes) {
            if (c.cod == cod) {
                return c;
            }
        }

        return null;
    }

    public static Clientes buscarPorNombre(String nombre) {
        for (Clientes c : clientes) {
            if (c.nombre.equalsIgnoreCase(nombre)) {
                return c;
            }
        }

        return null;
    }

    public static Clientes buscarPorApellidos(String apellidos) {
        for (Clientes c : clientes) {
            if (c.apellidos.equalsIgnoreCase(apellidos)) {
                return c;
            }
        }

        return null;
    }

    public static Clientes buscarPorEmail(String email) {
        for (Clientes c : clientes) {
            if (c.email.equalsIgnoreCase(email)) {
                return c;
            }
        }

        return null;
    }
}
