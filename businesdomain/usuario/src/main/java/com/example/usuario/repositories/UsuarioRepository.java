package com.example.usuario.repositories;

import com.example.usuario.entities.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {
}
