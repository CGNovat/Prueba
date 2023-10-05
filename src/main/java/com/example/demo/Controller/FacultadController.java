package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "/Form-facultad";
    }

    //guardar facultad
    @PostMapping("/registrar-facultad")
    public String registrarFacultad(@ModelAttribute("facultad") Facultad facultad) {
        // Procesa y guarda la facultad en la base de datos
        // facultadService.guardarFacultad(facultad);
        facultadService.Guardar(facultad);

        // Después de registrar la facultad, redirige al usuario a la lista de facultades
        return "redirect:/list-facultades";
    }

    //editar facultad
    @RequestMapping(value = "/id_facultad/{id_facultad}",method = RequestMethod.GET)
    public String Editar_facultad(Model model ,@PathVariable(name = "id_facultad",required = false)Long id_facultad){

        // Persona persona = personaService.findOne(id_persona);
        Facultad facultad =facultadService.findOne(id_facultad);
        // persona.setEstado_persona("A");
        facultad.setEstado_facultad("A");

        // model.addAttribute("persona", persona);
        model.addAttribute("facultad", facultad);
        // model.addAttribute("carreras", carrera.findAll()); // ----------------------------------
        // model.addAttribute("carrera", carrera);

        return "/list-facultades";
    }





    
}
