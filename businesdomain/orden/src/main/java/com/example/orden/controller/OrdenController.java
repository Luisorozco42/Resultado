package com.example.orden.controller;

import com.example.orden.entities.Orden;
import com.example.orden.service.OrdenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins =  "{http://localhost:8082}")
@RestController
@AllArgsConstructor
@RequestMapping("api/orden")
public class OrdenController {

    private OrdenService service;
    @GetMapping
    public ResponseEntity<List<Orden>> listarOrden(){
        List<Orden> ox = service.obtenerOrdenes();
        return new ResponseEntity<>(ox, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Orden> obtenerOrdenPorId(@PathVariable("id") Long id){
        Orden ox = service.listarPorId(id);
        return new ResponseEntity<>(ox, HttpStatus.OK);
    }
}
