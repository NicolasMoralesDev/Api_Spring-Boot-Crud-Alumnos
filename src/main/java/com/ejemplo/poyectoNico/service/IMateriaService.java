/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.poyectoNico.service;

import com.ejemplo.poyectoNico.model.Materia;
import com.ejemplo.poyectoNico.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */

@Service
public interface IMateriaService {
    
    public List<Materia> verMaterias();
    public void crearMateria (Materia mat);
    public void borrarMateria(Long id);
    public Materia buscarMateria(Long id);
   
}
