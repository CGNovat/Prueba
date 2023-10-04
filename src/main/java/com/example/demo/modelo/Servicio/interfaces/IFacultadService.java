package com.example.demo.modelo.Servicio.interfaces;
//modifique la carpeta servicio att tefy
import java.util.List;

import com.example.demo.modelo.Entity.Facultad;


public interface IFacultadService {
    
    public List<Facultad> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Facultad facultad);  //GUARDAR REGISTRO

    public Facultad findOne(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
}
