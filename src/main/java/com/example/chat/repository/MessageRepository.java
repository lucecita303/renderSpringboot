package com.example.chat.repository;

import com.example.chat.model.Message;
import com.example.chat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    // Buscar mensajes por usuario
    List<Message> findByUser(User user);

    // Buscar los más recientes, por ejemplo
    List<Message> findTop10ByOrderByTimestampDesc();
}
