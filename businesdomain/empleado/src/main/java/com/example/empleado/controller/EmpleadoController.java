package com.example.empleado.controller;

import com.example.empleado.entities.Empleado;
import com.example.empleado.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins =  "http://localhost:4200/", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@AllArgsConstructor
@RequestMapping("api/empleado")
public class EmpleadoController {

    private EmpleadoService service;
    @GetMapping
    public ResponseEntity<List<Empleado>> listarEmpleado() {

        List<Empleado> ex = service.obtenerEmpleado();
        return new ResponseEntity<>(ex, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Empleado> ObtenerEmpPorId(@PathVariable("id") Long id){
        Empleado emx = service.listarPorId(id);
        return new ResponseEntity<>(emx, HttpStatus.OK);
    }

}
