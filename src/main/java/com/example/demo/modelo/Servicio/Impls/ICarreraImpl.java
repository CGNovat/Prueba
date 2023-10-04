package com.example.demo.modelo.Servicio.Impls;
// modifique la carpeta servicio att tefy

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.modelo.Entity.Carrera;
import com.example.demo.modelo.Servicio.interfaces.ICarreraService;
import com.example.demo.modelo.Dao.CarreraDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ICarreraImpl implements ICarreraService{

      private final CarreraDao carreraDao;

       
    @Override
    public List<Carrera> ListCarrera() {
        
       return carreraDao.findAll();
    }

 @Override
    public Carrera Guardar(Carrera carrera) {
       
        return carreraDao.save(carrera);
    }

    @Override
    public Carrera buscarPorId(Long id) {
        return carreraDao.findById(id).orElse(null);
        
    }

    @Override
    public void delete(Long id) {
       
        
    }


}
