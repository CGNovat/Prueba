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


@Table(name = "ayudante")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Ayudante extends Auditoria {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ayudante")
    private Cocinero cocinero;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ayudante")
    private Empleado empleado;

    // ----------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAyudante;

    private String fechaNacimiento;
}
