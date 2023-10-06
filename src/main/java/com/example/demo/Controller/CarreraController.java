package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.modelo.Entity.Carrera;
import com.example.demo.modelo.Servicio.interfaces.ICarreraService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/carrera")
@Controller
public class CarreraController{

    @Autowired
    private ICarreraService carreraServicio;


    //--------------METODO PARA MOSTRAR LAS CARRERAS REGISTRADAS--------------
      @GetMapping("/listar")
    public String listarCAString(Model model) {

        List<Carrera> listaCarrera;

        listaCarrera = carreraServicio.ListCarrera();
        
        model.addAttribute("listaCarreras", listaCarrera);

        return "lista_registrados/List_Carrera";

    }
    
     //--------------METODO PARA REGISTRAR LAS CARRERAS--------------
    
        @GetMapping("/formulario")
    public String mostrarFormularioRegistro(Model model) {

        model.addAttribute("carrera", new Carrera());

        //-------------Variables Thymeleaf------------

        model.addAttribute("tipoFormulario", "registrar");

        model.addAttribute("ruta", "/almacen/registrar");

        return "Formularios/Form_Carreras";
    }

    // ---------Metodo para guardar los datos de la carrera--------------

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Carrera carrera, RedirectAttributes flash) {

        carrera.setEstado("A");

        carreraServicio.Guardar(carrera);

        // --------------------Variables Thymeleaf---------------------
        flash.addFlashAttribute("exitoso", "Carrera Registrada");

        return "redirect:/Formularios/Form_Carreras";

    }


}
