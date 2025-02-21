package pe.isil;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        Notificacion correo = new NotificacionCorreo();
        Notificacion sms = new NotificacionSMS();
        Notificacion whatsApp = new NotificacionWhatsApp();

        notificador.enviarNotificacion(correo, "Hola. Te enviamos un correo.");

        notificador.enviarNotificacion(sms, "Tu código de verificación es 1234.");

        notificador.enviarNotificacion(whatsApp, "Tienes un crédito preaprobado.");

    }
}