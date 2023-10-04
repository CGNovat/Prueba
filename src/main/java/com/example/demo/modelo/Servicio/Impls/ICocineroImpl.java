package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.CocineroDao;
import com.example.demo.modelo.Entity.Cocinero;
import com.example.demo.modelo.Servicio.interfaces.ICocineroService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ICocineroImpl implements ICocineroService{


@Autowired
private CocineroDao cocineroDao;

    @Override
    public Cocinero guardar(Cocinero entidad) {
        return cocineroDao.save(entidad);
    }

    @Override
    public List<Cocinero> listarCocinero() {
    return (List<Cocinero>) cocineroDao.findAll();
    }

    @Override
    public Cocinero buscarCocineroId(Long id) {
        return cocineroDao.findById(id).orElse(null);
    }
    
}
