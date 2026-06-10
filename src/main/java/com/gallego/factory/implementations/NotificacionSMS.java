package com.gallego.factory.implementations;

import com.gallego.factory.interfaces.Notificacion;

public class NotificacionSMS implements Notificacion {

    /**
     * Envía una notificación por SMS.
     *
     * @return Mensaje confirmando el envío del SMS.
     */
    @Override
    public String enviar() {
        return "Notificación enviada por SMS";
    }
}