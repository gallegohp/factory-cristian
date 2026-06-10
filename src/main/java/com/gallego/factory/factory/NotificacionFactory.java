package com.gallego.factory.factory;

import com.gallego.factory.interfaces.Notificacion;
import com.gallego.factory.implementations.NotificacionEmail;
import com.gallego.factory.implementations.NotificacionSMS;
import com.gallego.factory.implementations.NotificacionWhatsApp;


public class NotificacionFactory {

    /**
     * Crea una instancia de {@link Notificacion} según el tipo especificado.
     *
     * @param tipo El tipo de notificación a crear ("EMAIL", "SMS" o "WHATSAPP").
     * @return Una instancia de la implementación de {@link Notificacion} correspondiente.
     * @throws IllegalArgumentException Si el tipo de notificación no es válido.
     */
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de notificación no puede ser nulo");
        }

        if (tipo.equalsIgnoreCase("EMAIL")) {
            return new NotificacionEmail();
        }

        if (tipo.equalsIgnoreCase("SMS")) {
            return new NotificacionSMS();
        }

        if (tipo.equalsIgnoreCase("WHATSAPP")) {
            return new NotificacionWhatsApp();
        }

        throw new IllegalArgumentException("Tipo de notificación no válido: " + tipo);
    }
}