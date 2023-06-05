package com.example.orden.controller;

import com.example.orden.entities.Orden;
import com.example.orden.entities.OrdenDet;
import com.example.orden.service.ODetalleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins =  "http://localhost:4200/", exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RequestMapping("api/ordendet")
public class ODetalleController {

    private ODetalleService oDetalleService;
    @GetMapping
    public ResponseEntity<List<OrdenDet>> listarOrden(){
        List<OrdenDet> ox = oDetalleService.obtenerOrdenDetalles();
        return new ResponseEntity<>(ox, HttpStatus.OK);
    }
}
