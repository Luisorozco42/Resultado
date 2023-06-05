package com.example.usuario.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_usuarios")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false, unique = true)
    private Long IdUsuario;

    @Column(name = "idempleado", nullable = false, unique = true)
    private Long IdEmpleado;

    @Column(name = "login", length = 15, nullable = false, unique = true)
    private String Login;

    @Column(name = "pwd", length = 20, nullable = false, unique = true)
    private String Pwd;

    @Column(name = "activo", length = 1, nullable = false, unique = true)
    private String Activo;
}
