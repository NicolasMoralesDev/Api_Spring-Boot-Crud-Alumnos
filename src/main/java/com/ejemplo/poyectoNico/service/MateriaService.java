/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.poyectoNico.service;

import com.ejemplo.poyectoNico.model.Materia;
import com.ejemplo.poyectoNico.model.Persona;
import com.ejemplo.poyectoNico.repository.RepositoryMateria;
import com.ejemplo.poyectoNico.repository.RepositoryPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */

@Service
public class MateriaService implements IMateriaService{

    
    @Autowired
    
    public RepositoryMateria mate;
    public RepositoryPersona per;
    
    @Override
    public List<Materia> verMaterias() {
        
     return mate.findAll();
    }

    @Override
    public void crearMateria(Materia mat) {
        
        mate.save(mat);
    }

    @Override
    public void borrarMateria(Long id) {
        mate.deleteById(id);
    }

    @Override
    public Materia buscarMateria(Long id) {
        return mate.findById(id).orElse(null);
    }
    

}
