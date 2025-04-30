package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;


@Repository
public class PersonaRepository {
   private List<Persona> personas=new ArrayList<>();

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }
}
