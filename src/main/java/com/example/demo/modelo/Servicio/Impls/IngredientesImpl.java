package com.example.demo.modelo.Servicio.Impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Dao.IngredientesDao;
import com.example.demo.modelo.Entity.Ingredientes;
import com.example.demo.modelo.Servicio.interfaces.IIngredientesServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IngredientesImpl implements IIngredientesServicio{

 
    private final IngredientesDao ingredientesDao;

    @Override
    public Ingredientes guardar(Ingredientes ingredientes) {
       return ingredientesDao.save(ingredientes);
    }

    @Override
    public List<Ingredientes> listaingredinetes() {
       return ingredientesDao.findAll();
    }

    @Override
    public Ingredientes buscarPorId(Long id) {
        return ingredientesDao.findById(id).orElse(null);
    }
    


}
