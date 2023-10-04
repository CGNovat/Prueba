package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Entity.Semestre;
import com.example.demo.modelo.Servicio.interfaces.ISemestreService;
import com.example.demo.modelo.Dao.SemestreDao;
@Service
public class ISemestreImpl implements ISemestreService {

    @Override
    public List<Semestre> findAll() {
     
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void save(Semestre semestre) {
       
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Semestre findOne(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
