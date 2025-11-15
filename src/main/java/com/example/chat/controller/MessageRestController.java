package com.example.chat.controller;

import com.example.chat.model.Message;
import com.example.chat.repository.MessageRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class MessageRestController {

    private final MessageRepository messageRepository;

    public MessageRestController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }
}
