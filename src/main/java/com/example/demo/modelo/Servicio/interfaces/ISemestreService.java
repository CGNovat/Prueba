package com.example.demo.modelo.Servicio.interfaces;
import java.util.List;

import com.example.demo.modelo.Entity.Semestre;

public interface ISemestreService {
    
  public List<Semestre> ListSemestre(); //MOSTRAR TODOS LOS REGSITROS

    public Semestre Guardar(Semestre semestre);  //GUARDAR REGISTRO

    public Semestre buscarPorId(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
}
