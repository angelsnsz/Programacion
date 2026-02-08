package Primer_trimestre.Tema_4.Herencia.Restaurante;

public class Main {
    public static void main(String[] args) {

        Comanda[] comandas = new Comanda[2];

        Plato[] platosComanda1 = new Plato[2];
        platosComanda1[0] = new PrimerPlato("Sopa", 8.99, false);
        platosComanda1[1] = new Carnes("Chuletón", 25.99, "Al punto");

        Plato[] platosComanda2 = new Plato[5];
        platosComanda2[0] = new PrimerPlato("Macarrones", 9.99, true);
        platosComanda2[1] = new Carnes("Solomillo", 15.99, "Carbonizado");
        platosComanda2[2] = new Pescados("Merluza", 10.95);
        platosComanda2[3] = new Postres("Tarta de chocolate", 4.99, true);
        platosComanda2[4] = new Postres("Tarta de queso", 4.99, false);

        comandas[0] = new Comanda(1, 1, platosComanda1);
        comandas[1] = new Comanda(2, 2, platosComanda2);


        System.out.printf("Comanda 1 (%.2f€): \n%s" + (comandas[0].hayDiabeticosEnLaMesa() ? "HAY DIABETICOS EN LA MESA\n\n" : "NO HAY DIABETICOS EN LA MESA\n\n"), comandas[0].coste(), comandas[0]);
        System.out.printf("Comanda 2 (%.2f€): \n%s" + (comandas[1].hayDiabeticosEnLaMesa() ? "HAY DIABETICOS EN LA MESA\n\n" : "NO HAY DIABETICOS EN LA MESA\n\n"), comandas[1].coste(), comandas[1]);


    }
}
