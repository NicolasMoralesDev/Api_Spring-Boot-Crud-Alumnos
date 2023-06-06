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
public interface IPersonaService {
     
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
//    public void addMateria(Long personaid, Long materia);
}
