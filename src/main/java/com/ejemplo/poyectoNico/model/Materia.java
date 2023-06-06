/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.poyectoNico.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Nico Morales
 */


@Entity
@Table(name="Materia")
public class Materia {
    
    @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;

 @ManyToMany
    private List<Persona> alumnos;

    public Materia() {
    }

    public Materia(Long id, String nombre, List<Persona> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.alumnos = alumnos;
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

    public List<Persona> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Persona> alumnos) {
        this.alumnos = alumnos;
    }


    
}
