package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.modelo.Entity.Facultad;
import com.example.demo.modelo.Entity.Persona;
import com.example.demo.modelo.Servicio.interfaces.IFacultadService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/facultad")
@Controller
public class FacultadController {

    // @Autowired
    @Autowired IFacultadService facultadService;
    // private IFacultadService facultadService;
    // aqui comienza mi batalla :''''3
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Formulario en la vista HTML
    @RequestMapping(value = "/Form-facultad", method = RequestMethod.GET)
    public String Registro_Persona(Model model) {
        // Obtén la lista de facultades desde el servicio
        // List<Facultad> facultades = facultadService.obtenerTodasLasFacultades();
        List<Facultad> facultades = facultadService.ListFacultad();

        // Agrega la lista de facultades al modelo
        model.addAttribute("facultades", facultades);

        // Redirige a la vista "Form-facultad"
        return "Form-facultad";
    }
    




    
}
