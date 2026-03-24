package Primer_trimestre.Tema_5.Ejercicios_10.AnalizadorCiberseguridad;

public class LogCamara extends Log {
    String resolucion;
    public LogCamara(int id, String ip, String loc, String res) {
        super(id, ip, loc);
        this.resolucion = res;
    }
}
