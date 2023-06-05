package com.example.empleado.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idempleado", nullable = false, unique = true)
        private Long idEmpleado;

        @Column(name = "idprofesiones", nullable = false, unique = true)
        private Long idProfesiones;

        @Column(name = "idmunicipiores", nullable = false, unique = true)
        private Long idMunicipioRes;

        @Column(name = "idmunicipionac", nullable = false, unique = true)
        private Long idMunicipioNac;

        @Column(name = "iddepartamentonac", nullable = false, unique = true)
        private Long idDepartamentoNac;

        @Column(name = "iddepartamentores", nullable = false, unique = true)
        private Long idDepartamentoRes;

        @Column(name = "idpaisnac", nullable = false, unique = true)
        private Long idPaisNac;

        @Column(name = "idpaisres", nullable = false, unique = true)
        private Long idPaisRes;

        @Column(name = "ididentificacion", nullable = false, unique = true)
        private Long idIdentificacion;

        @Column(name = "idestadocivil", nullable = false, unique = true)
        private Long idEstadoCivil;

        @Column(name = "idsexo", nullable = false, unique = true)
        private Long idSexo;

        @Column(name = "idnacionalidad", nullable = false, unique = true)
        private Long idNacionalidad;

        @Column(name = "numidentificacion", length = 20, nullable = false, unique = true)
        private String numIdentificacion;

        @Column(name = "numinss", length = 15, nullable = false, unique = true)
        private String numINSS;

        @Column(name = "codminsa", length = 10, nullable = false, unique = true)
        private String codMinsa;

        @Column(name = "primernombre", length = 50, nullable = false, unique = true)
        private String primerNombre;

        @Column(name = "segundonombre", length = 50, nullable = false, unique = true)
        private String segundoNombre;

        @Column(name = "primerapellido", length = 50, nullable = false, unique = true)
        private String primerApellido;

        @Column(name = "segundoapellido", length = 50, nullable = false, unique = true)
        private String segundoApellido;

        @Column(name = "fechanac", nullable = false, unique = true)
        private Date fechaNacimiento;

        @Column(name = "edadingreso", length = 2, nullable = false, unique = true)
        private String edadIngreso;

        @Column(name = "email", length = 150, nullable = false, unique = true)
        private String email;

        @Column(name = "direcciondomiciliar", length = 150, nullable = false, unique = true)
        private String direccionDomiciliar;

        @Column(name = "telefonodomiciliar", length = 10, nullable = false, unique = true)
        private String telefonoDomiciliar;

        @Column(name = "telefonomovil", length = 10, nullable = false, unique = true)
        private String telefonoMovil;

        @Column(name = "fechacontrato", nullable = false, unique = true)
        private Date fechaContrato;

        @Column(name = "urlfoto", length = 50, nullable = false, unique = true)
        private String urlFoto;

        @Column(name = "activo", length = 1, nullable = false, unique = true)
        private String activo;
}
