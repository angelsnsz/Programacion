package Primer_trimestre.Tema_3.Ejercicios_4;

public class ControladorFlota {
    public static void main(String[] args) {
        NaveEspacial[] nave= new NaveEspacial [3];

        nave[0]=new NaveEspacial("nave1", 3);
        nave[1]=new NaveEspacial("nave2", 4);
        nave[2]=new NaveEspacial("nave3", 5);

        nave[0].viajar(30);
        nave[1].viajar(60);

        for (NaveEspacial p:nave ){
            p.mostrarEstado();
        }

        nave[0].repostar();
        nave[0].mostrarEstado();

        int combustible1=nave[0].getCombustible();
        int combustible2=nave[1].getCombustible();
        int combustible3=nave[2].getCombustible();

        int mayor;
        if (combustible1>combustible2 & combustible1>combustible3){
            mayor=0;
        } else if (combustible2>combustible1 & combustible2>combustible3) {
            mayor=1;
        }else {
            mayor=2;
        }
        System.out.println("La nave con mas combustible es: ");
        nave[mayor].mostrarEstado();
    }
}
