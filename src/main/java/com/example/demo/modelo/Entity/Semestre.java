package com.example.demo.modelo.Entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "semestre")
@Entity
@Setter
@Getter
public class Semestre {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id_semestre;

  private String Periodo;

  private String Duracion;

  private String Estado;

  private String Fecha_Inicio;

  private String Fecha_Salida;

  private String Profesores_Asignados;

  private String Cursos_Ofrecidos;

  // -----------------------------------RELACIONES-----------------------------------------------

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "id_carrera")
  // private Facultad facultad;

  // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // private List<Carrera> carrera;

  // //-----------

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // private Materia materia;

  // ----------------------------------------------------------------------------------

}
