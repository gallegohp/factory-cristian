package com.gallego.factory.interfaces;

public interface Notificacion {

    /**
     * Envía la notificación al destinatario.
     *
     * @return Mensaje confirmando que la notificación fue enviada correctamente.
     */
    String enviar();
}