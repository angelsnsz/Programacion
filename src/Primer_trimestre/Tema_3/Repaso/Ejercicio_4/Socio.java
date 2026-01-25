package Primer_trimestre.Tema_3.Repaso.Ejercicio_4;


    public class Socio {

        private static int contadorSocios = 0;

        private int id;
        private String nombre;

        // Constructor
        public Socio(String nombre) {
            contadorSocios++;
            this.id = contadorSocios;
            this.nombre = nombre;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        // Método estático
        public static int getTotalSocios() {
            return contadorSocios;
        }
    }
