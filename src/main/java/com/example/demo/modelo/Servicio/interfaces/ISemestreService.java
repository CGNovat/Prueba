package com.example.demo.modelo.Servicio.interfaces;
import java.util.List;

import com.example.demo.modelo.Entity.Semestre;

public interface ISemestreService {
    
    public List<Semestre> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Semestre semestre);  //GUARDAR REGISTRO

    public Semestre findOne(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
}
