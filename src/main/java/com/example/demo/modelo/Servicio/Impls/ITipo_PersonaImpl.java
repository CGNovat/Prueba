package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Servicio.interfaces.ITipo_PersonaService;

import lombok.RequiredArgsConstructor;

import com.example.demo.modelo.Entity.Tipo_Persona;

import com.example.demo.modelo.Dao.Tipo_personaDao;

@RequiredArgsConstructor
@Service
public class ITipo_PersonaImpl implements ITipo_PersonaService {

    private final Tipo_personaDao tipo_personaDao;

    @Override
    public List<Tipo_Persona> ListTipo_Persona() {

        return tipo_personaDao.findAll();
    }

    @Override
    public Tipo_Persona Guardar(Tipo_Persona tipo_Persona) {

        return tipo_personaDao.save(tipo_Persona);
    }

    @Override
    public Tipo_Persona buscarPorId(Long id) {
        return tipo_personaDao.findById(id).orElse(null);

    }

    @Override
    public void delete(Long id) {

    }

}
