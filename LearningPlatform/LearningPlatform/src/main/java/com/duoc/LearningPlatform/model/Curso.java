package com.duoc.LearningPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Long profesorId;

    public Curso() {
    }

    public Curso(Long id, String nombre, String descripcion, Long profesorId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.profesorId = profesorId;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Long getProfesorId() {
        return profesorId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProfesorId(Long profesorId) {
        this.profesorId = profesorId;
    }
}
