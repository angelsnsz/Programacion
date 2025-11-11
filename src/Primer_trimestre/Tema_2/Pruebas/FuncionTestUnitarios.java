package Primer_trimestre.Tema_2.Pruebas;

import java.util.Scanner;

/*
edad
accidentes
tipo
antiguedad
edad coche
color coche
 */
public class FuncionTestUnitarios {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cual es tu edad?");
        int edad = scanner.nextInt();
        System.out.println("has tenido accidentes? true/false");
        boolean accidentes=scanner.nextBoolean();
        System.out.println("que tipo de seguro quieres?");
        String tipoSeguro=scanner.next();
        System.out.println("cuantos años llevas con el seguro");
        int anyosConSeguro= scanner.nextInt();
        System.out.println("Cuantos años tiene tu coche");
        int edadCoche=scanner.nextInt();
        System.out.println("De que color es tu coche?");
        String colorCoche=scanner.next();

        scanner.close();
        PrecioSeguro(edad,accidentes,tipoSeguro,anyosConSeguro,edadCoche,colorCoche);
    }
    static double PrecioSeguro(int edad, boolean accidentes, String tipoSeguro, int anyosConSeguro,int edadCoche,String colorCoche){
        if (edad<18){
            return -1;
        }
        return 0;
    }
}
