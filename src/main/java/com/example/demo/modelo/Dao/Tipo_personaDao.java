package com.example.demo.modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Tipo_Persona;

@Repository
public interface Tipo_personaDao extends JpaRepository<Tipo_Persona, Long> {

    // @Query("SELECT a FROM Estante a WHERE a.nombreUnico LIKE %?1%")
    // List<tipo_personaDao> findAllLikenombreUnico(String nombreUnico);

}
