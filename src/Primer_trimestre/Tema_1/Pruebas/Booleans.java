package Pruebas;

public class Booleans {
    public static void main(String[] args) {
        boolean tengoDinero = true;
        boolean tengoUnaHoraLibre = true;
        System.out.println(tengoDinero && tengoUnaHoraLibre);

        tengoUnaHoraLibre = false;
        System.out.println(tengoDinero && tengoUnaHoraLibre);

        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        System.out.println("Puedo pagar: " + (tengoEfectivo || tengoTarjeta));

        boolean hagoEjercicios = true;
        System.out.println("hagoEjercicios: " + hagoEjercicios);
        System.out.println("hagoEjercicios: " + !hagoEjercicios);
    }
}
