package com.example.demo.modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Empleado;


@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Long>{
    
}
