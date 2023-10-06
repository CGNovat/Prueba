package com.example.demo.modelo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

  //    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //   @JoinColumn(name = "id_carrera")
  //   private Carrera carrera;

  // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //   private List<Carrera> carreras;

  //   //-----------------

  //   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materia")
  //   private Semestre semestre;

    //----------------------------------------
}
