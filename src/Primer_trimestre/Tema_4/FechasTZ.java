package Primer_trimestre.Tema_4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FechasTZ {
    public static void main(String[] args) {
        ZonedDateTime españa= ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime usa=ZonedDateTime.now(ZoneId.of("America/New York"));

        System.out.println("Hora española: " +españa);
        System.out.println("Hora USA: " + usa);
    }
}
