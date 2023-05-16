package com.lis.resultado.service.impl;

import com.lis.resultado.entities.Resultado;
import com.lis.resultado.repositories.ResultadoRepository;
import com.lis.resultado.service.ResultadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResultadoServiceImpl implements ResultadoService {

    private final ResultadoRepository resultadoRepository;
    @Override
    public Resultado crearResultado(Resultado r) {
        return resultadoRepository.save(r);
    }

    @Override
    public Resultado listarPorId(Long id) {
        Optional<Resultado> optiontionalResultado = resultadoRepository.findById(id);
        return optiontionalResultado.get();
    }

    @Override
    public List<Resultado> obtenerResultados() {
        return resultadoRepository.findAll();
    }

    @Override
    public void eliminarResultado(Long id) {
        resultadoRepository.deleteById(id);
    }
}
