package com.example.chat.controller;

import com.example.chat.model.Message;
import com.example.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // ✅ Inyectamos el repositorio (NO estático)
    @Autowired
    private MessageRepository messageRepository;

    // ✅ Este método tampoco debe ser estático
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message) {
        messageRepository.save(message);
        System.out.println("mensaje recibido: " + message);
        return message;
    }
}
