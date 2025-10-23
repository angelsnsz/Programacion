public class VariablesGTAVI {
    public static void main(String[] args) {

        long dinero = 1000000000000000000L;

        float saldo = 12345.89f;

        System.out.println(dinero);

        //no se puede encajar decimal en entero
        //int numero = 1923.48;

        double numero2 = 459.24;

        double cantidad = -124;

        final int notaFinDeCurso;
        double examen1 = 7.8;
        double examen2 = 5.4;
        double media = ( examen2 + examen1 ) / 2;
        System.out.println("La media seria " + media);

        //CASTING (moldear un numero para que quite los decimales)
        notaFinDeCurso = (int) media;
        System.out.println("La nota final es " + notaFinDeCurso);

        //Carecteres
        char inicial = 'A';
        System.out.println("Tu inicial es " + (byte) inicial);



    }
}
