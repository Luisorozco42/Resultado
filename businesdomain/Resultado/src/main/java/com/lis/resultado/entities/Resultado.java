package com.lis.resultado.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_resultados")
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResultados;
    private Long idExamen;
    private Long idOrden;
    private String resultado;
    private String observaciones;
    private String procesado;
    private String fechaProcesado;
    private String validado;
    private String fechaValidado;
    private String impreso;
    private String fechaImprime;
    private Integer imprime;
}
