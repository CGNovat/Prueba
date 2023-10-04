package com.example.demo.modelo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "materia")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Materia{

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Materia;

    private String nombre;
    private int código;
    private String turno;
    private String estado;

    //----------------RELACIONES---------------------

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materia")
    private List<Carrera> carrera;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materia")
    private Semestre semestre;

    //----------------------------------------
}
