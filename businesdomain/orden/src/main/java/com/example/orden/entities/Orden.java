package com.example.orden.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden" , nullable = false, unique = true)
    private Long idOrden;

    @Column(name = "N_Orden", length = 11)
    private String numeroOrden;

    @Column(name = "idempleado", nullable = false, unique = true)
    private Long idEmpleado;

    @Column(name = "idpaciente", nullable = false, unique = true)
    private Long idPaciente;

    @Column(name = "idtiposervicio", nullable = false, unique = true)
    private Long idTipoServicio;

    @Column(name = "idtipoorden", nullable = false, unique = true)
    private Long idTipoOrden;

    @Column(name = "Asistencia", length = 1)
    private String asistencia;

    @Column(name = "Observaciones", length = 200)
    private String observaciones;

    @Column(name = "fechaorden", nullable = false, unique = true)
    private Date fechaOrden;

    @Column(name = "Activo", length = 1)
    private String activo;

    @Column(name = "fechaimprime", nullable = false, unique = true)
    private Date fechaImprime;
}

