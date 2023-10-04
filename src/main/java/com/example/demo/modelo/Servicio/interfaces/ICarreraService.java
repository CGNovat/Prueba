package com.example.demo.modelo.Servicio.interfaces;
//modifique la carpeta servicio att tefy
import java.util.List;

import com.example.demo.modelo.Entity.Carrera;

public interface ICarreraService {

   public List<Carrera> ListCarrera(); //MOSTRAR TODOS LOS REGSITROS

    public Carrera Guardar(Carrera carrera);  //GUARDAR REGISTRO

    public Carrera buscarPorId(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
    
}
