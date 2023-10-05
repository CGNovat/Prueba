package com.example.demo.Controller;

import java.util.List;
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

    private final IPersonaService personaService;
    
// @Autowired
    // private IPersonaService personaService;
@GetMapping("/listar")
public String listarPersonas(Model model){
    
    List<Persona> listaPersonas;
    listaPersonas = personaService.ListPersona();
    model.addAttribute("listarPersonas", listaPersonas);
    return "/listarPersona";
    
}

}
