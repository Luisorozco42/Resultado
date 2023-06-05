package com.lis.resultado.controller;

import com.lis.resultado.entities.Resultado;
import com.lis.resultado.service.ResultadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RequestMapping("api/resultados")
public class ResultadoController {

    private ResultadoService service;

    @PostMapping("/save")
    public ResponseEntity<Resultado> crearResultado(@RequestBody Resultado r){
        Resultado rx = service.crearResultado(r);
        return new ResponseEntity<>(rx, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Resultado>> listarResultado(){
        List<Resultado> rxs = service.obtenerResultados();
        return new ResponseEntity<>(rxs, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Resultado> obtenerRxPorId(@PathVariable("id") Long id){
        Resultado rx = service.listarPorId(id);
        return new ResponseEntity<>(rx, HttpStatus.OK);
    }

    @DeleteMapping("delete/{idResultados}")
    public ResponseEntity<String> eliminarRx(@PathVariable("idResultados") Long idResultados){
        service.eliminarResultado(idResultados);
        return new ResponseEntity<>("Resultado eliminado correctamente", HttpStatus.OK);
    }
}
