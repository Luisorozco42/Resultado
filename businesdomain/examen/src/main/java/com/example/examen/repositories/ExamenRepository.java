package com.example.examen.repositories;

import com.example.examen.entities.examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<examen, Long> {
}
