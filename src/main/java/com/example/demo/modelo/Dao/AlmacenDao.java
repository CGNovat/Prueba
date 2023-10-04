package com.example.demo.modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Almacen;

@Repository
public interface AlmacenDao extends JpaRepository<Almacen,Long>{

    @Query("SELECT p FROM Almacen p WHERE p.nombreUnico LIKE %?1%")
     List<Almacen>  findAllLikenombreUnico(String nombreUnico);
    
}
