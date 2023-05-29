package com.example.orden.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdOrden;
    private String N_Orden;
    private Long IdEmpleado;
    private Long IdPaciente;
    private Long IdTipoServicio;
    private Long IdTipoOrden;
    private String Asistencia;
    private String Observaciones;
    private String FechaOrden;
    private String Activo;
    private String FechaImprime;
    private Long IdUsuarioImprime;
    private Integer Estado;
    private String Finalizado;
    private String FechaCita;
    private String FechaReporte;

}

