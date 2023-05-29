package com.example.examen.service;

import com.example.examen.entities.examen;

import java.util.List;

public interface ExamenService {
    examen listarPorId(Long Id);

    List<examen> obtenerExamen();

}
