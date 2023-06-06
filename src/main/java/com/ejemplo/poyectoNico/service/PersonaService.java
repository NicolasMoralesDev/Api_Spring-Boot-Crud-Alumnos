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
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public RepositoryPersona persoRepo;
    public RepositoryMateria mate;

    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

//    @Override
//    public Persona addMateria(Long personaId, Long materiaId) {
//        Optional<Persona> alumnoOptional = persoRepo.findById(personaId);
//        Optional<Materia> materiaOptional = mate.findById(materiaId);
//
//        Persona alumno = alumnoOptional.get();
//        Materia materia = materiaOptional.get();
//
//        alumno.getMaterias().add(materia);
//        persoRepo.save(alumno);
//        return ;

    
}
