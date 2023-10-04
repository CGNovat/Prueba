package com.example.demo.modelo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "persona")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona extends Auditoria{

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
    private Empleado empleado;

    // ----------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String ci;

    private String nombre;

    private String apellido;

    private String telefonoFijo;

    private String celular;

}
