/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.poyectoNico.controller;

import com.ejemplo.poyectoNico.model.Materia;
import com.ejemplo.poyectoNico.model.Persona;
import com.ejemplo.poyectoNico.service.IPersonaService;
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

public class Controller {
    @Autowired
    private  IPersonaService persoServ;
    
     @GetMapping ("/personas")
    public List <Persona> getPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/persona/{id}")
    public Persona getPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping("/persona") 
    public void personaPost(@RequestBody Persona persona){
         persoServ.crearPersona(persona);
    }
    
    
//    @PutMapping("/persona/{id}")
//     public Persona personaPut(@RequestBody Persona persona, @PathVariable Long id){
//         persona.setId(id);
//        return repositoryPersona.save(persona);
//    }
     
     @DeleteMapping("/persona/{id}")
     public void deletePersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
     
//     
//         @PostMapping("/{alumnoId}/{materiaId}")
//    public Persona addMateria(@PathVariable Long alumnoId, @PathVariable Long materiaId) {
//        return persoServ.addMateria(alumnoId, materiaId);
//    }
}
