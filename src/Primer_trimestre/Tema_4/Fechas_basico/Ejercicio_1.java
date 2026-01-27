package Primer_trimestre.Tema_4.Fechas_basico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Escribe un programa que muestre la fecha actual en el formato "Hoy es día, dd de mes de yyyy"
(ejemplo: "Hoy es miércoles, 02 de abril de 2025").
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        LocalDate fecha= LocalDate.now();
        DateTimeFormatter dia= DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter numero= DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter mes= DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter anio= DateTimeFormatter.ofPattern("yyyy");
        System.out.println("Hoy es " + dia.format(fecha) + ", " + numero.format(fecha) + " de " + mes.format(fecha) + " de " + anio.format(fecha) );
    }
}
