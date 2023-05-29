package com.example.empleado.service.impl;

import com.example.empleado.entities.Empleado;
import com.example.empleado.repositories.EmpleadoRepository;
import com.example.empleado.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Override
    public Empleado listarPorId(Long id) {
        Optional<Empleado> optionalEmpleado = empleadoRepository.findById(id);
        return optionalEmpleado.get();
    }

    @Override
    public List<Empleado> obtenerEmpleado() {
        return empleadoRepository.findAll();
    }


}
