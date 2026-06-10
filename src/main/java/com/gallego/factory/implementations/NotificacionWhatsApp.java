package com.gallego.factory.implementations;

import com.gallego.factory.interfaces.Notificacion;

public class NotificacionWhatsApp implements Notificacion {

    /**
     * Envía una notificación por WhatsApp.
     *
     * @return Mensaje confirmando el envío del WhatsApp.
     */
    @Override
    public String enviar() {
        return "Notificación enviada por WhatsApp";
    }
}