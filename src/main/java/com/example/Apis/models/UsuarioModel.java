package com.example.Apis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = { "correo" }))

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @NotBlank(message = "El campo nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "El campo correo no puede estar vacío")
    @Column(unique = true, nullable = false)
    private String correo;
    private String clave;
    @Column(unique = false, nullable = false)
    @ColumnDefault(value = "true")
    private Boolean activo;

    public UsuarioModel() {
        this.activo = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
