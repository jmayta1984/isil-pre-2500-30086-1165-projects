package pe.isil;

public class Main {
    public static void main(String[] args) {
        
        ProcesadorPagos procesadorPagos = new ProcesadorPagos();

        Pago pagoConTarjeta = new PagoConTarjeta();
        procesadorPagos.realizarPago(pagoConTarjeta, 200);

        Pago pagoConCripto = new PagoConCripto();
        procesadorPagos.realizarPago(pagoConCripto, 1000);


    }
}