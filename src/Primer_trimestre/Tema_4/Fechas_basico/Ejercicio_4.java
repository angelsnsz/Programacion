package Primer_trimestre.Tema_4.Fechas_basico;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
Crea un método que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        public static boolean esFinDeSemana(LocalDate fecha) {
            DayOfWeek dia = fecha.getDayOfWeek();
            return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
        }

        public static void main(String[] args) {
            LocalDate fecha = LocalDate.of(2025, 4, 5);
            System.out.println(esFinDeSemana(fecha));
        }
    }
}
