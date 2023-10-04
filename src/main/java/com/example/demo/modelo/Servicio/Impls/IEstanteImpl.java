package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.EstanteDao;
import com.example.demo.modelo.Entity.Estante;
import com.example.demo.modelo.Servicio.interfaces.IEstanteServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IEstanteImpl implements IEstanteServicio{

    private final EstanteDao estanteDao;

    @Override
    public Estante guardar(Estante estante) {
        return estanteDao.save(estante);
    }

    @Override
    public List<Estante> listestante() {
       return estanteDao.findAll();
    }

    @Override
    public Estante buscarPorId(Long id) {
        return estanteDao.findById(id).orElse(null);
    }

    @Override
    public List<Estante> BuscarSimilaresANombreUnico(String nombreUnico) {
       return estanteDao.findAllLikenombreUnico(nombreUnico);
    }

}
