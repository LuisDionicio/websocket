package com.example.chatdual.controller;

import com.example.chatdual.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatWSController {

    @MessageMapping("/mensaje") // Los clientes mandan a /app/mensaje
    @SendTo("/topic/publico") // Todos los suscritos a /topic/publico lo reciben
    public ChatMessage procesarMensaje(ChatMessage mensaje) {
        return mensaje;
    }
}