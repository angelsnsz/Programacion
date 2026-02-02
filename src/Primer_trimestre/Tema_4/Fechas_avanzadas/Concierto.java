package Primer_trimestre.Tema_4.Fechas_avanzadas;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Concierto
Planeas viajar desde Madrid a Londres para ver a tu banda favorita en concierto. Hoy es 03/04/2026,
 y el concierto es el sábado 05/04/2026 a las 20:00 (hora de Londres).
Sales de Madrid el sábado a las 11:30 (hora local), y el vuelo dura 2 horas y 15 minutos hasta Londres.
Desde el aeropuerto de Londres, tardas 45 minutos en llegar al lugar del concierto.
Se pide:
Calcula y muestra la hora local de salida desde Madrid y la hora local de llegada a Londres.
Determina a qué hora llegarás al lugar del concierto y si llegarás a tiempo para el inicio (20:00 en Londres).
El concierto dura 2 horas y 30 minutos.
Calcula la hora de fin y decide si podrás tomar un vuelo de vuelta a Madrid esa misma noche,
 que sale a las 23:45 (hora de Londres), considerando que necesitas 1 hora para volver al aeropuerto desde el concierto.
 */
public class Concierto {
    public static void main(String[] args) {

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId london = ZoneId.of("Europe/London");

        ZonedDateTime salidaMadrid = ZonedDateTime.of(
                2026, 4, 5,
                11, 30,
                0, 0,
                madrid
        );

        Duration vuelo = Duration.ofHours(2).plusMinutes(15);
        ZonedDateTime llegadaLondres = salidaMadrid
                .plus(vuelo)
                .withZoneSameInstant(london);

        ZonedDateTime llegadaConcierto = llegadaLondres.plusMinutes(45);

        ZonedDateTime inicioConcierto = ZonedDateTime.of(
                2026, 4, 5,
                20, 0,
                0, 0,
                london
        );

        Duration duracionConcierto = Duration.ofHours(2).plusMinutes(30);
        ZonedDateTime finConcierto = inicioConcierto.plus(duracionConcierto);

        ZonedDateTime vueloVuelta = ZonedDateTime.of(
                2026, 4, 5,
                23, 45,
                0, 0,
                london
        );

        ZonedDateTime llegadaAeropuerto = finConcierto.plusHours(1);

        System.out.println("Salida Madrid: " + salidaMadrid);
        System.out.println("Llegada Londres: " + llegadaLondres);
        System.out.println("Llegada al concierto: " + llegadaConcierto);

        if (!llegadaConcierto.isAfter(inicioConcierto)) {
            System.out.println("Llegas a tiempo al concierto");
        } else {
            System.out.println("Llegas tarde al concierto");
        }

        System.out.println("Fin del concierto: " + finConcierto);

        if (!llegadaAeropuerto.isAfter(vueloVuelta)) {
            System.out.println("Puedes coger el vuelo de vuelta a Madrid");
        } else {
            System.out.println("No llegas a tiempo al vuelo de vuelta");
        }
    }
}
