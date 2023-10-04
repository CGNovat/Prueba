package com.example.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Entity.Estante;
import com.example.demo.modelo.Servicio.interfaces.IEstanteServicio;

import lombok.RequiredArgsConstructor;

@RestController
//Todos los objetos que devuelvan los metodos, se devuelven en el formato clave-valor
// {"clave" : "Estanteverduras"}
@RequiredArgsConstructor
@RequestMapping("api/estante")
public class EstanteRest {
    
      private final IEstanteServicio estanteServicio;

      @GetMapping
      public ResponseEntity<List<Estante>> listEstante(){

        List<Estante> estante;

        estante = estanteServicio.listestante();

        return ResponseEntity.ok().body(estante);
      }


}
