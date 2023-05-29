package com.example.empleado.service;

import com.example.empleado.entities.Empleado;

import java.util.List;

public interface EmpleadoService {


    Empleado listarPorId(Long Id);
    List<Empleado> obtenerEmpleado();

}
