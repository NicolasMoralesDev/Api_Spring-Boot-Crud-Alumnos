/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.poyectoNico.controller;

import com.ejemplo.poyectoNico.model.Materia;
import com.ejemplo.poyectoNico.service.IMateriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nico Morales
 */
@RestController
@RequestMapping("/prueba")
public class MateriaController {

    @Autowired

    private IMateriaService mate;

    @GetMapping("/materias")
    public List<Materia> getPersonas() {
        return mate.verMaterias();
    }

    @PostMapping("/materia")
    public void postMateria(@RequestBody Materia mat) {
        mate.crearMateria(mat);
    }

    @DeleteMapping("/materia/{id}")
    public void deteleMateria(@PathVariable Long id) {
        mate.borrarMateria(id);
    }

    @GetMapping("/materia/{id}")
    public Materia getMateria(@PathVariable Long id) {
        return mate.buscarMateria(id);
    }


}
