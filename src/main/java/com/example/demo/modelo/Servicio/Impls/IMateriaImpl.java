package com.example.demo.modelo.Servicio.Impls;

//modifique la carpeta servicio att tefy
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Entity.Facultad;
import com.example.demo.modelo.Entity.Materia;
import com.example.demo.modelo.Servicio.interfaces.IMateriaService;

import lombok.RequiredArgsConstructor;

import com.example.demo.modelo.Dao.FacultadDao;
import com.example.demo.modelo.Dao.MateriaDao;

@RequiredArgsConstructor
@Service
public class IMateriaImpl implements IMateriaService {

  private final MateriaDao materiaDao;

       
    @Override
    public List<Materia> ListMateria() {
        
       return materiaDao.findAll();
    }

 @Override
    public Materia Guardar(Materia materia) {
       
        return materiaDao.save(materia);
    }

    @Override
    public Materia buscarPorId(Long id) {
        return materiaDao.findById(id).orElse(null);
        
    }

    @Override
    public void delete(Long id) {
       
        
    }

}