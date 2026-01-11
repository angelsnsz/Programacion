package Primer_trimestre.EjerciciosStrings;
/*
Realiza un programa que compruebe si en una palabra se repite alguna vocal más de 2 veces.
 El programa pedirá que se teclee una palabra y comprobará las vocales que contiene,
 cuando compruebe que una vocal aparece más de dos veces emitirá un mensaje en la pantalla y terminará.
  El programa debe terminar en el mismo instante en que encuentre más de dos vocales iguales,
  no esperará a comprobar toda la palabra (prohibido usar break).

Ejemplo: Escriba una palabra: “Instintivo”

Dará como resultado: “Tiene mas de dos vocales iguales”
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
        String palabra = "Instintivo";
        String s = palabra.toLowerCase();
        StringBuilder sb = new StringBuilder();

        boolean coincidencia = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                sb.append(s.charAt(i));
            }
        }
        int i = 0;
        while (!coincidencia && i < sb.length()) {
            char vow = sb.charAt(i);
            int contador = 0;

            for (int j = 0; j < sb.length() && !coincidencia; j++) {
                if (sb.charAt(j) == vow) {
                    contador++;
                }
                if (contador > 2) {
                    coincidencia = true;
                }
            }
            i++;
        }
        if (coincidencia) {
            System.out.println("La palabra " + palabra + " tiene más de dos vocales iguales");
        } else {
            System.out.println("La palabra " + palabra + " NO tiene más de dos vocales iguales");
        }

    }
}
