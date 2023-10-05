package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Persona;

public interface IPersonaService {

public List<Persona> ListPersona(); //MOSTRAR TODOS LOS REGSITROS

    public Persona Guardar(Persona persona);  //GUARDAR REGISTRO

    public Persona buscarPorId(Long nPersona);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
    
}
