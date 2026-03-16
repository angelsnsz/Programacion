package Primer_trimestre.Tema_5.Ejercicios_4.Set.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

/*
Ejercicio 5: Detector de Errores (Validación de add)
El método add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.
Tarea: Crea un Set<String> para matrículas de coches.
Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el método add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema"
 */
public class ValidacionEdad {
    public static void main(String[] args) {
        Set<String> matriculas= new HashSet<>();
        boolean anadido;
        for (int i = 0; i < 2; i++) {
            anadido = matriculas.add("7337A");
            if (!anadido){
                System.out.println("ERROR: La matricula ya existe en el sistema");
            } else {
                System.out.println("Matricula añadida con exito");
            }
        }
        System.out.println("Matriculas: " +matriculas);
    }
}
