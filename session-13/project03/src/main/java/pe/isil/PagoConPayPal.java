package pe.isil;

public class PagoConPayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal de: S/ " + monto);      
    }
}
