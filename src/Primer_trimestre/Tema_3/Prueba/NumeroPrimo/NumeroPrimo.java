package Primer_trimestre.Tema_3.Prueba.NumeroPrimo;

public class NumeroPrimo {


        private int numero;

        // Constructor
        public NumeroPrimo(int numero) {
            this.numero = numero;
        }

        // Método esPrimo()
        public boolean esPrimo() {
            if (numero < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Método siguiente()
        public NumeroPrimo siguiente() {
            int siguiente = numero + 1;

            while (true) {
                NumeroPrimo np = new NumeroPrimo(siguiente);
                if (np.esPrimo()) {
                    return np;
                }
                siguiente++;
            }
        }

        // Método posicion()
        public int posicion() {
            if (!esPrimo()) {
                return -1; // No es primo
            }

            int contador = 0;
            for (int i = 2; i <= numero; i++) {
                NumeroPrimo np = new NumeroPrimo(i);
                if (np.esPrimo()) {
                    contador++;
                }
            }
            return contador;
        }

        // Método sumaAnteriores()
        public int sumaAnteriores() {
            int suma = 0;

            for (int i = 2; i < numero; i++) {
                NumeroPrimo np = new NumeroPrimo(i);
                if (np.esPrimo()) {
                    suma += i;
                }
            }
            return suma;
        }

        public int getNumero() {
            return numero;
        }
    }

