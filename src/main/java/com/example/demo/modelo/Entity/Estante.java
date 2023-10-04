package com.example.demo.modelo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name = "estante")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Estante extends Auditoria {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "almacen_id_almacen")
  private Almacen almacen;

@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "estante_ingredientes",
    joinColumns = @JoinColumn(name = "id_estante"), 
    inverseJoinColumns = @JoinColumn(name = "id_ingredientes"), 
    uniqueConstraints = @UniqueConstraint(columnNames = {"id_estante", "id_ingredientes" }))
    private List<Ingredientes> ingredientes;

  // ----------------------------------------------------------------

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEstante;

  private String nombreUnico;

  private String numeroEstante;

  private String descripcion;

}
