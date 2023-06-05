package com.lis.resultado.service;

import com.lis.resultado.entities.Resultado;

import java.util.List;

public interface ResultadoService {

    Resultado crearResultado(Resultado r);
    Resultado listarPorId(Long id);
    List<Resultado> obtenerResultados();
    void eliminarResultado(Long idResultados);
}
