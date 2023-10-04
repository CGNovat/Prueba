package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Entity.Semestre;
import com.example.demo.modelo.Servicio.interfaces.ISemestreService;

import lombok.RequiredArgsConstructor;

import com.example.demo.modelo.Dao.SemestreDao;

@RequiredArgsConstructor
@Service
public class ISemestreImpl implements ISemestreService {

 private final SemestreDao semestreDao;

       
    @Override
    public List<Semestre> ListSemestre() {
        
       return semestreDao.findAll();
    }

 @Override
    public Semestre Guardar(Semestre semestre) {
       
        return semestreDao.save(semestre);
    }

    @Override
    public Semestre buscarPorId(Long id) {
        return semestreDao.findById(id).orElse(null);
        
    }

    @Override
    public void delete(Long id) {
       
        
    }
    
}
