package com.lis.resultado.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_resultados")
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idresultados", nullable = false, unique = true)
    private Long idResultados;

    @Column(name = "idexamen", nullable = false, unique = true)
    private Long idExamen;

    @Column(name = "idorden", nullable = false, unique = true)
    private Long idOrden;

    @Column(name = "resultado", length = 250, nullable = false, unique = true)
    private String resultado;

    @Column(name = "observaciones", length = 1000, nullable = false, unique = true)
    private String observaciones;

    @Column(name = "procesado", length = 1, nullable = false, unique = true)
    private String procesado;

    @Column(name = "fechaprocesa", nullable = false, unique = true)
    private Date fechaProcesa;

    @Column(name = "idusuarioprocesa", nullable = false, unique = true)
    private Long idUsuarioProcesa;

    @Column(name = "validado", length = 1, nullable = false, unique = true)
    private String validado;

    @Column(name = "fechavalida", nullable = false, unique = true)
    private Date fechaValida;

    @Column(name = "idusuariovalida", nullable = false, unique = true)
    private Long idUsuarioValida;

}
