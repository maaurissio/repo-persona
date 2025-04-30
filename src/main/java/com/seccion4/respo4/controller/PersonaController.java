package com.seccion4.respo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RequestMapping("/api/personas")

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @PostMapping
    public Persona postPersona(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    
    @GetMapping
    public List<Persona> getPersonas() {
        return personaService.listarPersonas();
    }
    
    
    
    
}
