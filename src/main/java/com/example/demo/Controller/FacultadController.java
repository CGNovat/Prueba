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

import com.example.demo.modelo.Entity.Facultad;
import com.example.demo.modelo.Servicio.interfaces.IFacultadService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/facultad")
@Controller
public class FacultadController {

    // @Autowired
    @Autowired IFacultadService facultadService;

    //--------------METODO PARA MOSTRAR LAS CARRERAS REGISTRADAS--------------
    @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Facultad> listaFacultad;

        listaFacultad = facultadService.ListFacultad();
        
        model.addAttribute("listaFacultades", listaFacultad);

        return "lista_registrados/lista_facultades";

    }

    //--------------METODO PARA REGISTRAR LAS FACULTADES--------------
    
    @GetMapping("/formulario")
    public String mostrarFormularioRegistro(Model model) {

        model.addAttribute("facultad", new Facultad());

        //-------------Variables Thymeleaf------------

        model.addAttribute("tipoFormulario", "registrar");
        model.addAttribute("ruta", "/facultad/registrar");

        return "Formularios/Form_facultad";
    }

    // ---------Metodo para guardar los datos de la facultad--------------

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Facultad facultad, RedirectAttributes flash) {

        // facultad.setEstado_facultad("A");
        facultad.setEstado_facultad("A");

        facultadService.Guardar(facultad);

        // --------------------Variables Thymeleaf---------------------
        flash.addFlashAttribute("exitoso", "Facultad Registrada");

        return "redirect:/facultad/formulario";
    }

    /*-----------------------------------------------------------------------
                    Funciones para modificar 
    -----------------------------------------------------------------------*/

    // ----Metodo para buscar el y mostrar-------

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificacion(Model model, @PathVariable Long id) {

        model.addAttribute("facultad", facultadService.buscarPorId(id));

        // --------------------Variables Thymeleaf---------------------

        model.addAttribute("tipoFormulario", "modificar");

        model.addAttribute("ruta", "/facultad/modificar");

        return "Formularios/Form_facultades";
    }

    // -------Metodo para guardar los datos modificados----------

    @PostMapping("/modificar")
    public String modificar(@ModelAttribute Facultad facultad, RedirectAttributes flash) {

        facultad.setEstado_facultad("A");

        facultadService.Guardar(facultad);

        flash.addFlashAttribute("exitoso", "facultades Modificado");

        return "redirect:/facultad/listar";

    }

    //----------------------------eliminar facutad---------------------------------------------------
        @GetMapping("/eliminar/{id_facultad}")
    public String eliminar(@PathVariable(name = "id_facultad") Long idfacultad, RedirectAttributes flash) {
        //quando usars PathVariable sempre usa GetMapping

        Facultad facultad;

        facultad = facultadService.buscarPorId(idfacultad);

        facultad.setEstado_facultad("X");

        facultadService.Guardar(facultad);

        flash.addFlashAttribute("exitoso", "facultad Eliminada");

        return "redirect:/facultad/listar";
    }



}
