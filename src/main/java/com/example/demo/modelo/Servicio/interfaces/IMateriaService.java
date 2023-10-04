package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Materia;

public interface IMateriaService {

public List<Materia> ListMateria(); //MOSTRAR TODOS LOS REGSITROS

    public Materia Guardar(Materia materia);  //GUARDAR REGISTRO

    public Materia buscarPorId(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO

}
