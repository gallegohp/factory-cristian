package com.gallego.factory.service;

import com.gallego.factory.interfaces.Notificacion;
import com.gallego.factory.factory.NotificacionFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

    /**
     * Envía una notificación del tipo especificado.
     *
     * @param tipo El tipo de notificación a enviar ("EMAIL", "SMS" o "WHATSAPP").
     * @return Mensaje confirmando el envío de la notificación.
     */
    public String enviarNotificacion(String tipo) {
        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipo);
        return notificacion.enviar();
    }
}