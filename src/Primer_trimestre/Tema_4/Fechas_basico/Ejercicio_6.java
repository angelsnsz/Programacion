package Primer_trimestre.Tema_4.Fechas_basico;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);

        int laborables = 0;

        while (!inicio.isAfter(fin)) {
            DayOfWeek dia = inicio.getDayOfWeek();
            if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                laborables++;
            }
            inicio = inicio.plusDays(1);
        }

        System.out.println("Días laborables: " + laborables);
    }
}
