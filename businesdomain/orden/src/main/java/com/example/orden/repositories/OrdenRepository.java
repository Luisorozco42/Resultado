package com.example.orden.repositories;

import com.example.orden.entities.orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<orden, Long> {
}
