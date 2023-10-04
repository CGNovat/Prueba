package com.example.demo.modelo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "almacen")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Almacen extends Auditoria {
    

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "almacen")
    private List<Estante> estante;
    

//----------------------------------------------------------------

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idAlmacen;

private String nombreUnico;

private String numeroUnico;

private String descripcion;

}
