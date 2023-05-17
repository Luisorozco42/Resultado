package com.example.usuario.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_usuarios")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUsuario;
    private Long IdEmpleado;
    private String Login;
    private String Pwd;
    private String Activo;
    private Integer Estado;
    private Long IdUsuarioCreacion;
    private Long IdUsuarioModificacion;
    private Long IdUsuarioEliminacion;
    private String FechaCreacion;
    private String FechaModificacion;
    private String FechaEliminacion;

}
