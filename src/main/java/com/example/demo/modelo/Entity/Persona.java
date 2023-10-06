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

@Table(name = "persona")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_persona;

    private String ci;

    private String nombre;

    private String apellido;

    private String genero;

    private String estado_civil;

    private String telefonoFijo;

    private String direccion;

    private String celular;

    private String Estado;

    // ---------------Relaciones--------------------------

    // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JoinColumn(name = "Id_tipo_persona")
    // private Tipo_Persona tipo_persona;

    // --------------------------

}
