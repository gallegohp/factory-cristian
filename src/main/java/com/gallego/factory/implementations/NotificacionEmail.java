package com.gallego.factory.implementations;

import com.gallego.factory.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion {

    /**
     * Envía una notificación por correo electrónico.
     *
     * @return Mensaje confirmando el envío del correo electrónico.
     */
    @Override
    public String enviar() {
        return "Notificación enviada por correo electrónico";
    }
}