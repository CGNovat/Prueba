package com.example.demo.modelo.Servicio.Impls;
//yo estefane modifique la carpeta servicio

import java.util.List;
//modifique la carpeta servicio att tefy
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.FacultadDao;
import com.example.demo.modelo.Entity.Facultad;
import com.example.demo.modelo.Servicio.interfaces.IFacultadService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IFacultadImpl implements IFacultadService{

    private final FacultadDao facultadDao;

       
    @Override
    public List<Facultad> ListFacultad() {
        
       return facultadDao.findAll();
    }

 @Override
    public Facultad Guardar(Facultad carrera) {
       
        return facultadDao.save(carrera);
    }

    @Override
    public Facultad buscarPorId(Long id) {
        return facultadDao.findById(id).orElse(null);
        
    }

    @Override
    public void delete(Long id) {
       
        
    }

}
