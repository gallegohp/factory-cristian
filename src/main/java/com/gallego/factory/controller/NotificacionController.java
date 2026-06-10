package com.gallego.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gallego.factory.service.NotificacionService;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService service;

    /**
     * Endpoint para enviar notificación por correo electrónico.
     *
     * @return Mensaje confirmando el envío del correo electrónico.
     */
    @GetMapping("/email")
    public String enviarEmail() {
        return service.enviarNotificacion("EMAIL");
    }

    /**
     * Endpoint para enviar notificación por SMS.
     *
     * @return Mensaje confirmando el envío del SMS.
     */
    @GetMapping("/sms")
    public String enviarSMS() {
        return service.enviarNotificacion("SMS");
    }

    /**
     * Endpoint para enviar notificación por WhatsApp.
     *
     * @return Mensaje confirmando el envío del WhatsApp.
     */
    @GetMapping("/whatsapp")
    public String enviarWhatsApp() {
        return service.enviarNotificacion("WHATSAPP");
    }
}