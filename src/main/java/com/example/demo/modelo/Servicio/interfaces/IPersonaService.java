package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Persona;

public interface IPersonaService {

    public List<Persona> findAll();

    public void save(Persona persona);

    public Persona findOne(Long id);

    public void delete(Long id);
    
}
