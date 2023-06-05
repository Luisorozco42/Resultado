package com.example.orden.service;

import com.example.orden.entities.Orden;

import java.util.List;

public interface OrdenService {
    Orden listarPorId(Long id);
    List<Orden> obtenerOrdenes();
    List<Orden> listarPorCampo(Long idTipoOrden);

    List<Orden> listarPorIdOrden(Long idOrden);

}