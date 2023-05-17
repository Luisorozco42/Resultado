package com.example.empleado.repositories;

import com.example.empleado.entities.empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<empleado, Long> {
}
