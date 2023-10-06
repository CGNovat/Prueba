package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.modelo.Entity.Persona;
import com.example.demo.modelo.Servicio.interfaces.IPersonaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/persona")
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

//--------------METODO PARA MOSTRAR LAS PERSONAS REGISTRADAS--------------
      @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Persona> listaPersonas;

        listaPersonas = personaService.ListPersona();
        
        model.addAttribute("listaPersonas", listaPersonas);

        return "lista_registrados/List_Persona";

    }

         //--------------METODO PARA REGISTRAR LAS CARRERAS--------------
    
        @GetMapping("/formulario")
    public String mostrarFormularioRegistro(Model model) {

        model.addAttribute("persona", new Persona());

        //-------------Variables Thymeleaf------------

        model.addAttribute("tipoFormulario", "registrar");

        model.addAttribute("ruta", "/persona/registrar");

        return "Formularios/Form_Persona";
    }

    //    ---------Metodo para guardar los datos de la carrera--------------

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Persona persona, RedirectAttributes flash) {

        persona.setEstado("A");

        personaService.Guardar(persona);

        // --------------------Variables Thymeleaf---------------------
        flash.addFlashAttribute("exitoso", "Persona Registrada");

        return "redirect:/persona/formulario";

    }

    @GetMapping("/eliminar/{id_persona}")
    public String eliminar(@PathVariable(name = "id_persona") Long idPersona, RedirectAttributes flash) {

        Persona persona;

        persona = personaService.buscarPorId(idPersona);

        persona.setEstado("X");

        personaService.Guardar(persona);

        flash.addFlashAttribute("exitoso", "Persona Eliminada");

        return "redirect:/persona/listar";
    }

    // ----------------------Metodo para eliminar un almacen-------------

    @PostMapping("/activar")
    public String activar(@RequestParam Long idPersona, RedirectAttributes flash) {

        Persona persona;

        persona = personaService.buscarPorId(idPersona);

        persona.setEstado("A");

        personaService.Guardar(persona);

        flash.addFlashAttribute("exitoso", "Persona Activa");

        return "redirect:/persona/formulario";
        
    }




}


