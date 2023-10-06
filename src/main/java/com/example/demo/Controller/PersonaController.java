package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modelo.Entity.Persona;
import com.example.demo.modelo.Servicio.interfaces.IPersonaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/persona")
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //     //--------------METODO PARA MOSTRAR LAS CARRERAS REGISTRADAS--------------
      @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Persona> listaPersonas;

        listaPersonas = personaService.ListPersona();
        
        model.addAttribute("listaPersonas", listaPersonas);

        return "lista_registrados/List_Persona";

    }

}


