package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Cocinero;

public interface ICocineroService {
    
     Cocinero guardar(Cocinero entidad);

     List<Cocinero> listarCocinero();

     Cocinero buscarCocineroId(Long id);

}
