package pe.isil;

public class PagoConCripto implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con criptomonedas de: S/ " + monto);
    }

}
