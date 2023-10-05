package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Entity.Carrera;
import com.example.demo.modelo.Servicio.interfaces.ICarreraService;

import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @RequestMapping("/carrera")
@Controller
public class CarreraController{

    @Autowired
    private ICarreraService carreraServicio;

      @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Carrera> listaCarrera;

        listaCarrera = carreraServicio.ListCarrera();
        
        model.addAttribute("listaCarreras", listaCarrera);

        return "lista_registrados/List_Carrera";

    }
   
}
