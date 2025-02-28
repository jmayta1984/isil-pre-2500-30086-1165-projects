package pe.isil;

public class CamaraSeguridad implements Seguridad{

    @Override
    public void prender() {
        System.out.println("Cámara de seguridad encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Cámara de seguridad apagada");
    }

    @Override
    public void grabarVideo() {
        System.out.println("Cámara de seguridad grabando");
    }

}
