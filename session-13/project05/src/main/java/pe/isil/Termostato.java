package pe.isil;

public class Termostato implements ControlTemperatura {

    @Override
    public void prender() {
        System.out.println("Termostato encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Termostato apagado");
    }

    @Override
    public void ajustarTemperatura(int temperatura) {
        System.out.println("Temperatura ajustada a: " + temperatura);
    }

}
