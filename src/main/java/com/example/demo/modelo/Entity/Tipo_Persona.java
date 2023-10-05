package com.example.demo.modelo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name = "tipo_persona")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Tipo_Persona {

  // ----------------------------------------------------------------



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id_tipo_persona;
    
    private String nombre;

    private String descripcion;

    private String Estado;

    //---------------RELACIONES---------------------

    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JoinColumn(name = "id_persona")
    // private List<Persona> personas;

    //-------------------------

  //   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //   @JoinColumn(name = "id_carrera")
  //   private Facultad facultad;

  // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //   private List<Persona> personas;

    //--------------------------------

}


//   @ManyToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "almacen_id_almacen")
//   private Almacen almacen;

// @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//     @JoinTable(name = "estante_ingredientes",
//     joinColumns = @JoinColumn(name = "id_estante"), 
//     inverseJoinColumns = @JoinColumn(name = "id_ingredientes"), 
//     uniqueConstraints = @UniqueConstraint(columnNames = {"id_estante", "id_ingredientes" }))
//     private List<Ingredientes> ingredientes;
