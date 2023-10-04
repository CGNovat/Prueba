package com.example.demo.modelo.Servicio.interfaces;

import java.util.List;

import com.example.demo.modelo.Entity.Almacen;

public interface IAlmacenServicie {
    
   List<Almacen> listAlmacen();

   Almacen guardar(Almacen almacen);

   Almacen buscarPorId(Long id);

   List<Almacen>  BuscarSimilaresANombreUnico(String nombreUnico);

}
