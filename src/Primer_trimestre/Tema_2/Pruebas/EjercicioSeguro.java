package Primer_trimestre.Tema_2.Pruebas;

import java.util.Scanner;

/*
Precio fijo del seguro 500
>18 && <25 +20%
>35 && <55 -10% && !accidentes
>65 && !accidentes +10%
>65 && accidentes +30%
 */
public class EjercicioSeguro {
    public static void main(String[] args) {
        double PrecioFijo = 500;
        Scanner scanner= new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?");
        int edad= scanner.nextInt();
        System.out.println("¿Has tenido accidentes? true/false");
        boolean accidentes= scanner.nextBoolean();

        calculoSeguro(PrecioFijo, edad, accidentes);
    }
    static void calculoSeguro( double PrecioFijo, int edad, boolean accidentes){
        if (edad >18 && edad <25){
            System.out.println("Tu precio es= " + (PrecioFijo * 1.20));
        } else if (edad >35 && edad<55 && accidentes==false){
            System.out.println("Tu precio es= " + (PrecioFijo * 0.90));
        } else if (edad >65 && accidentes==false){
            System.out.println("Tu precio es = " + (PrecioFijo * 1.10));
        } else {
            System.out.println("Tu precio es= " + (PrecioFijo * 1.30));
        }
    }
}
