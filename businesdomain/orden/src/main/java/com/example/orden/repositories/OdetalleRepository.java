package com.example.orden.repositories;

import com.example.orden.entities.OrdenDet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OdetalleRepository extends JpaRepository<OrdenDet, Long> {
}
