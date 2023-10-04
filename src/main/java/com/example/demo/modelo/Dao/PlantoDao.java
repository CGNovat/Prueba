package com.example.demo.modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Entity.Plato;

@Repository
public interface PlantoDao extends JpaRepository<Plato, Long>{
    
}
