package com.example.demo.modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Tipo_Persona;

@Repository
public interface tipo_personaDao extends JpaRepository<Tipo_Persona, Long>{

    // @Query("SELECT a FROM Estante a WHERE a.nombreUnico LIKE %?1%")
    //  List<tipo_personaDao>  findAllLikenombreUnico(String nombreUnico);
    
}
