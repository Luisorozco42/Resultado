package com.example.usuario.service.impl;

import com.example.usuario.entities.usuario;
import com.example.usuario.repositories.UsuarioRepository;
import com.example.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public usuario listarPorId(Long id) {
        Optional<usuario> optiontionalUsuario = usuarioRepository.findById(id);
        return optiontionalUsuario.get();

        }
    @Override
    public List<usuario> obtenerUsuario() {
        return usuarioRepository.findAll();
    }

  }


