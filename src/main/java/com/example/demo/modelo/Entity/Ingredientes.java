package com.example.demo.modelo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "ingredientes")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Ingredientes extends Auditoria{

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredientes")
    private List<Plato> plato;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredientes")
    private List<Estante> estante;

    // -------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredientes;

    private String nombre;

    private String cantidad;

}
