package com.example.chat.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // <-- este campo es el que falta

    private String sender;     // nombre o id del usuario
    private String content;    // mensaje
    private LocalDateTime timestamp = LocalDateTime.now();

    // Constructores
    public Message() {}
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getSender() { return sender; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setSender(String sender) { this.sender = sender; }
    public void setContent(String content) { this.content = content; }
}
