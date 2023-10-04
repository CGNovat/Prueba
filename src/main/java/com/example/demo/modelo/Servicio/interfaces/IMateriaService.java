package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Materia;

public interface IMateriaService {

    public List<Materia> findAll(); // MOSTRAR TODOS LOS REGSITROS

    public void save(Materia materia); // GUARDAR REGISTRO

    public Materia findOne(Long id); // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO

}
