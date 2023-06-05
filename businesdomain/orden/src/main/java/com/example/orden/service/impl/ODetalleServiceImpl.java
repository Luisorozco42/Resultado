package com.example.orden.service.impl;

import com.example.orden.entities.OrdenDet;
import com.example.orden.repositories.OdetalleRepository;
import com.example.orden.service.ODetalleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ODetalleServiceImpl implements ODetalleService {

    private final OdetalleRepository odetalleRepository;
    @Override
    public List<OrdenDet> obtenerOrdenDetalles() {
        return odetalleRepository.findAll();
    }
}
