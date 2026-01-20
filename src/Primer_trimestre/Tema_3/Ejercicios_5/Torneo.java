package Primer_trimestre.Tema_3.Ejercicios_5;

public class Torneo {
    public static void main(String[] args) {
        Robot Robot1=new Robot("Mazinger", "3");
        Robot Robot2=new Robot("Optimus","45");

        Robot1.mostrarEstadisticas();
        Robot2.mostrarEstadisticas();

        while (Robot1.estaVivo() && Robot2.estaVivo()) {
            System.out.println("------------------------");
            Robot1.atacar(Robot2);
            if (Robot2.estaVivo()) {
                Robot2.atacar(Robot1);
            }
            System.out.printf("Mazinger: %.2f puntos de vida\n", Robot1.getVida());
            System.out.printf("Optimus: %.2f puntos de vida\n", Robot2.getVida());
        }

        if (Robot1.estaVivo()) {
            System.out.println("El ganador es Mazinger");
        } else {
            System.out.println("El ganador es Optimus");
        }
    }
}
