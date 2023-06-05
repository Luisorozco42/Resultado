package com.example.orden.repositories;

import com.example.orden.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
    @Query("SELECT o FROM Orden o WHERE o.idTipoOrden = :idTipoOrden")
    List<Orden> findByidtipoorden(@Param("idTipoOrden") Long idTipoOrden);

    @Query("SELECT a FROM Orden a WHERE a.idOrden = :idOrden")
    List<Orden> findByidOrden(@Param("idOrden") Long idOrden);
}