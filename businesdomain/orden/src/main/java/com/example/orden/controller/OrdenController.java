package com.example.orden.controller;

import com.example.orden.entities.Orden;
import com.example.orden.service.OrdenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@CrossOrigin(origins =  "http://localhost:4200/", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
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

    @GetMapping("idTipoOrden/{idTipoOrden}")
    public ResponseEntity<List<Orden>> obtenerOrdenPorTipoOrden(@PathVariable("idTipoOrden") Long idTipoOrden) {
        List<Orden> ox = service.listarPorCampo(idTipoOrden);
        if (ox != null) {
            return new ResponseEntity<>(ox, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("idOrden/{idOrden}")
    public ResponseEntity<List<Orden>> listarPorIdOrden(@PathVariable("idOrden") Long idOrden){
        List<Orden> ox = service.listarPorIdOrden(idOrden);
        if(ox != null){
            return new ResponseEntity<>(ox, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
