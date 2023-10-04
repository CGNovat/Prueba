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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table (name = "cocinero")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cocinero extends Auditoria{

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "cocinero_plato", joinColumns = @JoinColumn(name = "id_cocinero"), 
    inverseJoinColumns = @JoinColumn(name = "id_plato"), 
    uniqueConstraints = @UniqueConstraint(columnNames = {"id_cocinero", "id_plato" }))
    private List<Plato> platos;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cocinero")
    private Empleado empleada;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ayudante_id_ayudante")
    private Ayudante ayudante;

    // ----- ----------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCocinero;

    private String anosServicio;

}
