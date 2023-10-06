package com.example.demo.modelo.Servicio.Impls;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.PersonaDao;
import com.example.demo.modelo.Entity.Persona;
import com.example.demo.modelo.Servicio.interfaces.IPersonaService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IPersonaImpl implements IPersonaService {

 private final PersonaDao personaDao;

    @Override
    public List<Persona> ListPersona() {
        
       return personaDao.findAll();
    }

 @Override
    public Persona Guardar(Persona persona) {
       
        return personaDao.save(persona);
    }

    @Override
    public Persona buscarPorId(Long id) {
        return personaDao.findById(id).orElse(null);
        
    }

    @Override
    public void delete(Long id) {
       
        
    }

}
