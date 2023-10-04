package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Ingredientes;

public interface IIngredientesServicio {

    Ingredientes guardar(Ingredientes ingredientes);

    List<Ingredientes> listaingredinetes();

    Ingredientes buscarPorId(Long id);
    
}
