package Primer_trimestre.Tema_4.Fechas_avanzadas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Proyecto
Eres el responsable de un proyecto en tu empresa y necesitas planificar las fechas clave.
El proyecto empieza el próximo lunes (suponiendo que hoy es 28/02/2025) y tiene las siguientes fases:
Fase 1: Análisis, dura 5 días laborables (lunes a viernes).
Fase 2: Desarrollo, dura 15 días laborables.
Fase 3: Pruebas, dura 7 días laborables.
Se pide:
Calcular y mostrar la fecha de inicio y fin de cada fase, considerando solo días laborables.
Si el proyecto termina antes del 15/03/2026, imprime "¡Entrega a tiempo!". Si no, imprime "¡Hay que darse prisa!".
Como bonus, calcula cuántos días naturales (incluyendo fines de semana) dura todo el proyecto desde el inicio hasta el fin.
 */
public class Proyecto {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.of(2025, 2, 28);

        LocalDate inicioProyecto = hoy.with(DayOfWeek.MONDAY).plusWeeks(1);

        LocalDate inicioFase1 = inicioProyecto;
        LocalDate finFase1 = sumarDiasLaborables(inicioFase1, 5);

        LocalDate inicioFase2 = finFase1.plusDays(1);
        LocalDate finFase2 = sumarDiasLaborables(inicioFase2, 15);

        LocalDate inicioFase3 = finFase2.plusDays(1);
        LocalDate finFase3 = sumarDiasLaborables(inicioFase3, 7);

        System.out.println("Inicio proyecto: " + inicioProyecto);
        System.out.println("\nFase 1 - Análisis:");
        System.out.println("Inicio: " + inicioFase1);
        System.out.println("Fin: " + finFase1);

        System.out.println("\nFase 2 - Desarrollo:");
        System.out.println("Inicio: " + inicioFase2);
        System.out.println("Fin: " + finFase2);

        System.out.println("\nFase 3 - Pruebas:");
        System.out.println("Inicio: " + inicioFase3);
        System.out.println("Fin: " + finFase3);

        LocalDate fechaLimite = LocalDate.of(2026, 3, 15);

        if (finFase3.isBefore(fechaLimite)) {
            System.out.println("\n¡Entrega a tiempo!");
        } else {
            System.out.println("\n¡Hay que darse prisa!");
        }

        long diasNaturales = ChronoUnit.DAYS.between(inicioProyecto, finFase3) + 1;
        System.out.println("\nDuración total del proyecto (días naturales): " + diasNaturales);
    }

    private static LocalDate sumarDiasLaborables(LocalDate fechaInicio, int diasLaborables) {
        LocalDate fecha = fechaInicio;
        int cont = 0;

        while (cont < diasLaborables) {
            if (fecha.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
                cont++;
            }
            if (cont < diasLaborables) {
                fecha = fecha.plusDays(1);
            }
        }
        return fecha;
    }
}
