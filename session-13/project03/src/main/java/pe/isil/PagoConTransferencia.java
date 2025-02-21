package pe.isil;

public class PagoConTransferencia implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con transferencia de: S/ " + monto);    
    }

}
