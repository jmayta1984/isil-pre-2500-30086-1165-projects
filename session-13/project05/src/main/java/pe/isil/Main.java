package pe.isil;

public class Main {
    public static void main(String[] args) {
        ControlEncendido luzInteligente = new LuzInteligente();
        luzInteligente.prender();

        ControlEncendido termostato = new Termostato();
        termostato.prender();
        if (termostato instanceof ControlTemperatura) {
            ((ControlTemperatura)termostato).ajustarTemperatura(10);
        }
        
        ControlEncendido camaraSeguridad = new CamaraSeguridad();
        camaraSeguridad.prender();

        if (camaraSeguridad instanceof Seguridad) {
            ((Seguridad)camaraSeguridad).grabarVideo();;
        }
    }
}