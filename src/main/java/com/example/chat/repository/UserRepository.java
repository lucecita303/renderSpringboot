package com.example.chat.repository;

import com.example.chat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Puedes agregar consultas personalizadas, por ejemplo:
    User findByUsername(String username);
}
