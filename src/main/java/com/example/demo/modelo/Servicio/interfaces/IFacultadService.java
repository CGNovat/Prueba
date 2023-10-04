package com.example.demo.modelo.Servicio.interfaces;
//modifique la carpeta servicio att tefy
import java.util.List;

import com.example.demo.modelo.Entity.Facultad;


public interface IFacultadService {
    
   public List<Facultad> ListFacultad(); //MOSTRAR TODOS LOS REGSITROS

    public Facultad Guardar(Facultad facultad);  //GUARDAR REGISTRO

    public Facultad buscarPorId(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
}
