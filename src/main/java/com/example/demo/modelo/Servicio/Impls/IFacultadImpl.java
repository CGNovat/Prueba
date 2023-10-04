package com.example.demo.modelo.Servicio.Impls;
//yo estefane modifique la carpeta servicio

import java.util.List;
//modifique la carpeta servicio att tefy
import org.springframework.stereotype.Service;
import com.example.demo.modelo.Dao.CarreraDao;
import com.example.demo.modelo.Entity.Carrera;
import com.example.demo.modelo.Servicio.interfaces.ICarreraService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class IFacultadImpl implements ICarreraService{

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
