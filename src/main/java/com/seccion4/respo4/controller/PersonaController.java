package com.seccion4.respo4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.service.PersonaService;






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
    
    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable int id){
        return personaService.buscarxId(id);
    }

    @GetMapping("/rut/{rut}")
    public Persona getPersonaxRut(@PathVariable String rut){
        return personaService.buscarpoRut(rut);
    }
    
}
