package com.example.demo.modelo.Servicio.Impls;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Entity.Persona;
import com.example.demo.modelo.Servicio.interfaces.IPersonaService;
import com.example.demo.modelo.Dao.PersonaDao;
@Service
public class IPersonaImpl implements IPersonaService{

    

    @Override
    public List<Persona> findAll() {
      
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void save(Persona persona) {
      
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Persona findOne(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    

}
