package Primer_trimestre.Repaso_Strings;

public class Ejercicio_2 {
    public static void main(String[] args) {
        String texto="java es facil";
        System.out.println("texto original: " +texto);
        System.out.println("en mayusculas: " +texto.toUpperCase());
        System.out.println("reemplazo de facil por poderoso: " +texto.replace("facil", "poderoso"));
        System.out.println("extraer palabra java: " + texto.substring(0,4));
        String invertida=new StringBuilder(texto).reverse().toString();
        System.out.println(invertida);
    }
}
