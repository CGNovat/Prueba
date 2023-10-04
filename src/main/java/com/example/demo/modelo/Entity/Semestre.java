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

import lombok.Getter;
import lombok.Setter;


@Table(name = "semestre")
@Entity
@Setter
@Getter
public class Semestre{    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_semestre;

    private String Periodo;

    private String Duración;

    private String Estado;

    private String Fecha_Inicio;

    private String Fecha_Salida;

    private String Profesores_Asignados;

    private String Cursos_Ofrecidos;


    //-----------------------------------RELACIONES-----------------------------------------------

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "semestre")
    private List<Carrera> carrera;
    
     @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "semestre")
    private Materia materia;

    //----------------------------------------------------------------------------------


}
