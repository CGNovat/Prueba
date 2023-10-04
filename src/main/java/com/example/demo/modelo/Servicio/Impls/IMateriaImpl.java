package com.example.demo.modelo.Servicio.Impls;

//modifique la carpeta servicio att tefy
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Entity.Materia;
import com.example.demo.modelo.Servicio.interfaces.IMateriaService;
import com.example.demo.modelo.Dao.MateriaDao;
@Service
public class IMateriaImpl implements IMateriaService {

    @Autowired
    private MateriaDao materiaDao;

    @Override
    public List<Materia> findAll() {

        return (List<Materia>) materiaDao.findAll();
    }

    @Override
    public void save(Materia materia) {

        materiaDao.save(materia);
    }

    @Override
    public Materia findOne(Long id) {

        return materiaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {

        materiaDao.deleteById(id);
    }

}