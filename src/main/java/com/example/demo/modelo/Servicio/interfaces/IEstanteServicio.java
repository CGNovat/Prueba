package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Estante;

public interface IEstanteServicio {

  Estante guardar(Estante estante);

  List<Estante> listestante();

  Estante buscarPorId(Long id);

  List<Estante>  BuscarSimilaresANombreUnico(String nombreUnico);

}
