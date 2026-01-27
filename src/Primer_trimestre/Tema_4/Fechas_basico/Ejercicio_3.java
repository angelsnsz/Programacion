package Primer_trimestre.Tema_4.Fechas_basico;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
Japón ("Asia/Tokyo") y México ("America/Mexico_City")
en el formato "dd/MM/yyyy HH:mm z"
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        ZonedDateTime España= ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime Japon= ZonedDateTime.now(ZoneId.of("Asia/Tokio"));
        ZonedDateTime mexico= ZonedDateTime.now(ZoneId.of("America/Mexico City"));

        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        System.out.println("España: " +España.format(formato));
        System.out.println("Japon: " + Japon.format(formato));
        System.out.println("Mexico: " + mexico.format(formato));
    }
}
