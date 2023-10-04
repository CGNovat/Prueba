package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import com.example.demo.modelo.Entity.Tipo_Persona;
import com.example.demo.modelo.Servicio.interfaces.ITipo_PersonaService;
import com.example.demo.modelo.Dao.Tipo_personaDao;

@RequiredArgsConstructor
@Service
public class ITipo_PersonaImpl implements ITipo_PersonaService{
    
    private final Tipo_personaDao tipo_personaDao;

    @Override
    public List<Tipo_Persona> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void save(Tipo_Persona tipopersona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Tipo_Persona findOne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
    


}
