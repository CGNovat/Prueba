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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.modelo.Entity.Carrera;
import com.example.demo.modelo.Entity.Tipo_Persona;
import com.example.demo.modelo.Servicio.Impls.ITipo_PersonaImpl;
import com.example.demo.modelo.Servicio.interfaces.ICarreraService;
import com.example.demo.modelo.Servicio.interfaces.ITipo_PersonaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/tipoPersona")
@Controller
public class TipoPersonaController {
    

  @Autowired
    private ITipo_PersonaService iTipo_PersonaService;


    //--------------METODO PARA MOSTRAR LOS TIPOS DE PERSONA REGISTRADAS--------------

      @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Tipo_Persona> listaTipo_Persona;

        listaTipo_Persona = iTipo_PersonaService.ListTipo_Persona();
        
        model.addAttribute("listaCarreras", listaTipo_Persona);

        return "lista_registrados/List_tipo_Persona";

    }

    //--------------------------------------------
    
     //--------------METODO PARA REGISTRAR--------------
    
        @GetMapping("/formulario")
    public String mostrarFormularioRegistro(Model model) {

        model.addAttribute("tipo_Persona", new Tipo_Persona());

        //-------------Variables Thymeleaf------------

        model.addAttribute("tipoFormulario", "registrar");

        model.addAttribute("ruta", "/tipoPersona/registrar");

        return "Formularios/Form_tipo_Persona";
    }

    // ---------Metodo para guardar--------------

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Tipo_Persona tipo_Persona, RedirectAttributes flash) {

        tipo_Persona.setEstado("A");

        iTipo_PersonaService.Guardar(tipo_Persona);

        // --------------------Variables Thymeleaf---------------------
        flash.addFlashAttribute("exitoso", "Tipo persona de Registrada");

        return "redirect:/tipoPersona/formulario";

    }


 /*-----------------------------------------------------------------------
                    Funciones para modificar 
    -----------------------------------------------------------------------*/

    // ----Metodo para buscar el y mostrar-------

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificacion(Model model, @PathVariable Long id) {

        model.addAttribute("tipoPersona", iTipo_PersonaService.buscarPorId(id));

        // --------------------Variables Thymeleaf---------------------

        model.addAttribute("tipoFormulario", "modificar");

        model.addAttribute("ruta", "/carrera/modificar");

        return "Formularios/Form_Carreras";
    }

    // -------Metodo para guardar los datos modificados----------

    @PostMapping("/modificar")
    public String modificar(@ModelAttribute Tipo_Persona tipo_Persona, RedirectAttributes flash) {

        tipo_Persona.setEstado("A");

        iTipo_PersonaService.Guardar(tipo_Persona);

        flash.addFlashAttribute("exitoso", "Tipo de Persona Modificado");

        return "redirect:/tipoPersona/listar";

    }


}
