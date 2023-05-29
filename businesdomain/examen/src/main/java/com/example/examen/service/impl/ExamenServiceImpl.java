package com.example.examen.service.impl;

import com.example.examen.entities.examen;
import com.example.examen.repositories.ExamenRepository;
import com.example.examen.service.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl implements ExamenService {

    private final ExamenRepository examenRepository;

    @Override
    public examen listarPorId(Long id) {
        Optional<examen> optionalExamen = examenRepository.findById(id);
        return optionalExamen.get();
    }

    @Override
    public List<examen> obtenerExamen() {
        return examenRepository.findAll() ;
    }


}
