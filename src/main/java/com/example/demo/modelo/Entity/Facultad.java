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

@Table(name = "facultad")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facultad {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_facultad;

  private String nombre_facultad;
  private String sigla;
  private Boolean estado_facultad;

  // -------------------RELACIONES--------------

  // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // @JoinColumn(name = "id_carrera")
  // private Carrera carrera;

  // ---------------------------------

}
