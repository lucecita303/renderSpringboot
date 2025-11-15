package com.example.chat.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users") // Evitamos conflictos, ya que "user" es palabra reservada en PostgreSQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String username;

    private String displayName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> messages;

    // --- Getters y Setters ---
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getDisplayName() { return displayName; }
    public List<Message> getMessages() { return messages; }

    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    public void setMessages(List<Message> messages) { this.messages = messages; }
}
