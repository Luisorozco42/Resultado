package com.example.examen.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_examenes")
public class examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexamen", nullable = false, unique = true)
    private Long idExamen;

    @Column(name = "idarealabservicio", nullable = false, unique = true)
    private Long idAreaLabServicio;

    @Column(name = "idmetodologia", nullable = false, unique = true)
    private Long idMetodologia;

    @Column(name = "idcategoriaexamenes", nullable = false, unique = true)
    private Long idCategoriaExamenes;

    @Column(name = "idtipomuestra", nullable = false, unique = true)
    private Long idTipoMuestra;

    @Column(name = "idunidadmedidas", nullable = false, unique = true)
    private Long idUnidadMedidas;

    @Column(name = "idtiporesultado", nullable = false, unique = true)
    private Long idTipoResultado;

    @Column(name = "descripcion", length = 50, nullable = false, unique = true)
    private String descripcion;

    @Column(name = "descripcioncorta", length = 25, nullable = false, unique = true)
    private String descripcionCorta;

    @Column(name = "liscode", length = 10, nullable = false, unique = true)
    private String liscode;

    @Column(name = "conteo", length = 1, nullable = false, unique = true)
    private String conteo;

    @Column(name = "confidencial", length = 1, nullable = false, unique = true)
    private String confidencial;

    @Column(name = "calculado", length = 1, nullable = false, unique = true)
    private String calculado;
}
