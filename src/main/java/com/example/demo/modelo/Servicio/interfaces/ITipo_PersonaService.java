package com.example.demo.modelo.Servicio.interfaces;
import java.util.List;

import com.example.demo.modelo.Entity.Tipo_Persona;

public interface ITipo_PersonaService {
    
    public List<Tipo_Persona> findAll();

    public void save(Tipo_Persona tipopersona);

    public Tipo_Persona findOne(Long id);

    public void delete(Long id);
}
