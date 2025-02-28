package pe.isil;

public class LuzInteligente implements ControlEncendido {

    @Override
    public void prender() {
        System.out.println("Luz inteligente encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Luz inteligente apagada");
    }

}
