package com.example.examen.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_examenes")
public class examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdExamen;
    private Long IdAreaLabServicio;
    private Long IdMetodologia;
    private Long IdCategoriaExamenes;
    private Long IdTipoMuestra;
    private Long IdUnidadMedidas;
    private Long IdTipoResultado;
    private String Descripcion;
    private String DescripcionCorta;
    private String LisCode;
    private String Conteo;
    private String Confidencial;
    private String Calculado;
    private Integer Estado;
}
