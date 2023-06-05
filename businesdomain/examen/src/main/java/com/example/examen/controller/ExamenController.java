package com.example.examen.controller;

import com.example.examen.entities.examen;
import com.example.examen.service.ExamenService;
import com.example.examen.service.impl.ExamenServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@AllArgsConstructor
@RequestMapping("api/examen")
public class ExamenController {
    private ExamenService service;

    @GetMapping
    public ResponseEntity<List<examen>> listarExamen(){
        List<examen> es = service.obtenerExamen();
        return new ResponseEntity<>(es, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<examen> obtenerExsPorId(@PathVariable("id") Long id){
        examen exs = service.listarPorId(id);
        return new ResponseEntity<>(exs, HttpStatus.OK);
    }
}
