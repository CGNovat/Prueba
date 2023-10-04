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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "plato")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Plato extends Auditoria {

  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  @JoinTable(name = "plato_ingredientes", joinColumns = @JoinColumn(name = "id_plato"), 
  inverseJoinColumns = @JoinColumn(name = "id_ingredientes"),
   uniqueConstraints = @UniqueConstraint(columnNames = {"id_plato", "id_ingredientes" }))
  private List<Ingredientes> ingredientes;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "platos")
  private List<Cocinero> cocinero;

  // -----------------------------------------------------------------------

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPlanto;

  private String tipoPlato;

  private String nombrePlato;

}
