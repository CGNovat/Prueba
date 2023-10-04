package com.example.demo.modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Estante;

@Repository
public interface EstanteDao extends JpaRepository<Estante, Long>{

    @Query("SELECT a FROM Estante a WHERE a.nombreUnico LIKE %?1%")
     List<Estante>  findAllLikenombreUnico(String nombreUnico);
    
}
