package Primer_trimestre.Tema_5.Ejercicios_6.Map.Ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Ejercicio 1: El Diccionario de Traducción (Básico)
El objetivo es comprender la relación Clave-Valor y el uso de put y get.
Tarea: Crea un HashMap<String, String> llamado diccionario.
Acción: Añade 5 parejas de palabras Inglés-Español (ej: "Apple" - "Manzana").
Consulta: Pide una palabra en inglés por teclado y muestra su traducción. Si no existe, muestra un mensaje de error.
Consulta2: Busca si existe una palabra en Español.
 */
public class DiccionarioTraduccion {
    public static void main(String[] args) {
        HashMap<String, String> diccionario= new HashMap<>();
        diccionario.put("Apple", "Manzana");
        diccionario.put("Sky","Cielo");
        diccionario.put("Beach","Playa");
        diccionario.put("Browser","Navegador");
        diccionario.put("Window", "Ventana");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra en inglés: ");
        String palabra= sc.nextLine();
        for (int i=0 ; i< diccionario.size();i++){
            if (diccionario.containsKey(palabra)){
                System.out.println(i);
            }else {
                System.out.println("Error, esa palabra no esta.");
            }
        }
        System.out.println("Escribe una palabra en español");
        String palabra2= sc.nextLine();
        if (diccionario.containsValue(palabra2)){
            System.out.println(palabra2 + " existe");
        }else {
            System.out.println("Error, esa palabra no esta.");
        }
    }
}
