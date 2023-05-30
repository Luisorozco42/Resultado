package com.example.usuario.service;

import com.example.usuario.entities.usuario;

import java.util.List;
public interface UsuarioService {

    usuario listarPorId(Long id);
    List<usuario> obtenerUsuario();

}
