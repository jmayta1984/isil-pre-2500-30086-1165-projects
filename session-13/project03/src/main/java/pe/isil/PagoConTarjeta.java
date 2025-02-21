package pe.isil;

public class PagoConTarjeta implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de: S/ " + monto);    
    }

}
