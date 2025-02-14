package pe.isil;

public class Main {
    public static void main(String[] args) {
        
        Competicion competicion = new Competicion();

        competicion.inscribirParticipante();

        competicion.inscribirParticipante();

        competicion.inscribirParticipante();

        competicion.ordernarPorMarcaPersonal();

        competicion.mostrarOrdenParticipacion();
    }
}