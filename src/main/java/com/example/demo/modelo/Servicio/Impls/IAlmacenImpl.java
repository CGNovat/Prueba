package com.example.demo.modelo.Servicio.Impls;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.AlmacenDao;
import com.example.demo.modelo.Entity.Almacen;
import com.example.demo.modelo.Servicio.interfaces.IAlmacenServicie;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IAlmacenImpl implements IAlmacenServicie{


    private final AlmacenDao almacenDao;

    @Override
    public List<Almacen> listAlmacen() {
        return almacenDao.findAll();
    }

    @Override
    public Almacen guardar(Almacen almacen) {
        return almacenDao.save(almacen);
    }

    @Override
    public Almacen buscarPorId(Long id) {
        return almacenDao.findById(id).orElse(null);
    }

    @Override
    public List<Almacen> BuscarSimilaresANombreUnico(String nombreUnico) {
        return almacenDao.findAllLikenombreUnico(nombreUnico);
    }

    }
    

