package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;


@Repository
public class PersonaRepository {
   private List<Persona> personas=new ArrayList<>();

   PersonaRepository(){
    //Agregar las personas a la lista
    personas.add(new Persona(1, "12345678-9", "Wacoldo", "Soto", 45));
    personas.add(new Persona(2, "23456780-1", "Vicnte", "Colicheo",20));
    personas.add(new Persona(3, "98765432-1", "Lucas", "Sanchez", 19));
    personas.add(new Persona(4, "45678921-3", "Tomas", "Cortes", 19));
    personas.add(new Persona(5, "19874562-0", "Mauricio", "Gajardo", 20));
   }
   
    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }

    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for(Persona persona : personas){
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;
    }

    public Persona readxRut(String rut){
        for(Persona persona : personas){
            if(persona.getRut().equals(rut)){
                return persona;
            }
        }
        return null;
    }
}
