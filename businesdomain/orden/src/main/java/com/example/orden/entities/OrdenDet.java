package com.example.orden.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_ordenesdetalle")
public class OrdenDet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idordendetalle" , nullable = false, unique = true)
    private Long idOrdenDet;

    @Column(name = "idorden" , nullable = false, unique = true)
    private Long idOrden;

    @Column(name = "N_Orden", length = 11)
    private String observaciones;

    @Column(name = "idexamen" , nullable = false, unique = true)
    private Long idexamen;

    @Column(name = "Activo", length = 1)
    private String activo;
}
