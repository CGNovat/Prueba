package com.example.demo.modelo.Servicio.interfaces;
import java.util.List;

import com.example.demo.modelo.Entity.Tipo_Persona;

public interface ITipo_PersonaService {
    
public List<Tipo_Persona> ListTipo_Persona(); //MOSTRAR TODOS LOS REGSITROS

    public Tipo_Persona Guardar(Tipo_Persona tipo_Persona);  //GUARDAR REGISTRO

    public Tipo_Persona buscarPorId(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
}
