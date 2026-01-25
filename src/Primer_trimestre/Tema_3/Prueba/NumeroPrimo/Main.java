package Primer_trimestre.Tema_3.Prueba.NumeroPrimo;


    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce un número entero: ");
            int n = sc.nextInt();

            NumeroPrimo np = new NumeroPrimo(n);

            int opcion;
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Comprobar si es primo");
                System.out.println("2. Obtener el siguiente primo");
                System.out.println("3. Obtener la posición del primo");
                System.out.println("4. Sumar primos anteriores");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¿Es primo? " + np.esPrimo());
                        break;

                    case 2:
                        NumeroPrimo siguiente = np.siguiente();
                        System.out.println("Siguiente primo: " + siguiente.getNumero());
                        break;

                    case 3:
                        int pos = np.posicion();
                        if (pos == -1) {
                            System.out.println("El número no es primo, no tiene posición.");
                        } else {
                            System.out.println("Posición en la lista de primos: " + pos);
                        }
                        break;

                    case 4:
                        System.out.println("Suma de primos anteriores: " + np.sumaAnteriores());
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 0);

            sc.close();
        }
    }

