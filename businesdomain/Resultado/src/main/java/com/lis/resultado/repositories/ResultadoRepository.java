package com.lis.resultado.repositories;

import com.lis.resultado.entities.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
}
