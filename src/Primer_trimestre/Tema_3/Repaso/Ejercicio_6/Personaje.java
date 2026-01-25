package Primer_trimestre.Tema_3.Repaso.Ejercicio_6;


    public class Personaje {

        private String nombre;
        private int nivel;
        private int puntosVida;
        private boolean esMagico;

        // Constructor
        public Personaje(String nombre, boolean esMagico) {
            this.nombre = nombre;
            this.esMagico = esMagico;
            this.nivel = 1;
            this.puntosVida = 100;
        }

        // Recibir daño
        public void recibirDaño(int daño) {
            if (esMagico) {
                daño *= 0.8;
            }

            puntosVida -= daño;

            if (puntosVida < 0) {
                puntosVida = 0;
            }
        }

        // Curar
        public void curar() {
            if (nivel < 5) {
                puntosVida += 10;
            } else {
                puntosVida += 25;
            }

            if (puntosVida > 100) {
                puntosVida = 100;
            }
        }

        // (Opcional) subir nivel
        public void subirNivel() {
            nivel++;
        }
    }

