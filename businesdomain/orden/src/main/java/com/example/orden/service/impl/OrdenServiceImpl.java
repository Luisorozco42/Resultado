package com.example.orden.service.impl;

import com.example.orden.entities.Orden;
import com.example.orden.repositories.OrdenRepository;
import com.example.orden.service.OrdenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdenServiceImpl implements OrdenService{
    private final OrdenRepository ordenRepository;
    @Override
    public Orden listarPorId(Long id) {
        Optional<Orden> optiontionalOrden = ordenRepository.findById(id);
        return optiontionalOrden.get();
    }

    @Override
    public List<Orden> obtenerOrdenes() {
        return ordenRepository.findAll();
    }

    @Override
    public List<Orden> listarPorCampo(Long idTipoOrden) {
        // Lógica para buscar por el campo idTipoOrden en la tabla
        return ordenRepository.findByidtipoorden(idTipoOrden);
    }

    @Override
    public List<Orden> listarPorIdOrden(Long idOrden){
        return ordenRepository.findByidOrden(idOrden);
    }
}
