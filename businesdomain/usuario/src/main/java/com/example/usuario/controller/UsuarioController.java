package com.example.usuario.controller;

import com.example.usuario.entities.usuario;
import com.example.usuario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins =  "{http://localhost:4200}", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@AllArgsConstructor
@RequestMapping("api/usuario")
public class UsuarioController {

    
    private UsuarioService service;


    @GetMapping
    public ResponseEntity<List<usuario>> listarUsuario(){
        List<usuario> rxs = service.obtenerUsuario();
        return new ResponseEntity<>(rxs, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<usuario> obtenerRxPorId(@PathVariable("id") Long id){
        usuario rx = service.listarPorId(id);
        return new ResponseEntity<>(rx, HttpStatus.OK);
    }

    }
