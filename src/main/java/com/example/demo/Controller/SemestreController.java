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
import com.example.demo.modelo.Entity.Semestre;
import com.example.demo.modelo.Servicio.interfaces.ISemestreService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/semestre")
@Controller
public class SemestreController {

    @Autowired
    private ISemestreService semestreServicio;

    // --------------METODO PARA MOSTRAR LOS SEMESTRES REGISTRADOS--------------
    @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Semestre> listaSemestre;

        listaSemestre = semestreServicio.ListSemestre();

        model.addAttribute("listaSemestres", listaSemestre);

        return "lista_registrados/List_Semestre";

    }

    // --------------------------------------------

    // --------------METODO PARA REGISTRAR LAS CARRERAS--------------

    @GetMapping("/formulario")
    public String mostrarFormularioRegistro(Model model) {

        model.addAttribute("semestre", new Semestre());

        // -------------Variables Thymeleaf------------

        model.addAttribute("tipoFormulario", "registrar");

        model.addAttribute("ruta", "/semestre/registrar");

        return "Formularios/Form_Semestre";
    }

    // ---------Metodo para guardar los datos de la carrera--------------

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Semestre semestre, RedirectAttributes flash) {

        semestre.setEstado("A");

        semestreServicio.Guardar(semestre);

        // --------------------Variables Thymeleaf---------------------
        flash.addFlashAttribute("exitoso", "Semestre Registrado");

        return "redirect:/semestre/formulario";

    }

    /*-----------------------------------------------------------------------
                    Funciones para modificar 
    -----------------------------------------------------------------------*/

    // ----Metodo para buscar el y mostrar-------

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificacion(Model model, @PathVariable Long id) {

        model.addAttribute("carrera", semestreServicio.buscarPorId(id));

        // --------------------Variables Thymeleaf---------------------

        model.addAttribute("tipoFormulario", "modificar");

        model.addAttribute("ruta", "/semestre/modificar");

        return "Formularios/Form_Semestres";
    }

    // -------Metodo para guardar los datos modificados----------

    @PostMapping("/modificar")
    public String modificar(@ModelAttribute Semestre semestre, RedirectAttributes flash) {

        semestre.setEstado("A");

        semestreServicio.Guardar(semestre);

        flash.addFlashAttribute("exitoso", "Semestre Modificado");

        return "redirect:/semestre/listar";

    }

     @GetMapping("/eliminar/{id_carrera}")
    public String eliminar(@PathVariable(name = "id_carrera") Long idSemestre, RedirectAttributes flash) {
        //quando usars PathVariable sempre usa GetMapping

        Semestre semestre;

        semestre = semestreServicio.buscarPorId(idSemestre);

        semestre.setEstado("X");

        semestreServicio.Guardar(semestre);

        flash.addFlashAttribute("exitoso", "Semestre Eliminada");

        return "redirect:/semestre/listar";
    }

}
