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

@Table(name = "carrera")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Carrera {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_carrera;

  private String Estado;

  private String nombre;

  private String Especializacion;

  private String Vision;

  private String Mision;

  private String PerfilProfecional;

  private String PoliticaExamen; // Sistema semestral/Anual

  private String Direccion;

  private String FechaCreacion;

  // ----------------RELACIONES--------------------- PRUEBA 234

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "Id_materia")
  // private Materia materia;

  // //-------------------

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "Id_tipo_persona")
  // private Tipo_Persona tipo_Persona;

  // //----------------

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "id_semestre")
  // private Semestre semestre;

  // //--------------------
  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "id_facultad")
  // private Facultad facultad;

  // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // private List<Facultad> facultades;

  // -----------------------------------

}
