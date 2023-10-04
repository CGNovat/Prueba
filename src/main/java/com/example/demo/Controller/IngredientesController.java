// package com.example.demo.Controller;


// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.example.demo.modelo.Entity.Ingredientes;

// import com.example.demo.modelo.Servicio.interfaces.IIngredientesServicio;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @RequestMapping("/ingredientes")
// @Controller
// public class IngredientesController {

//     private final IIngredientesServicio ingredientesServicio;

//     @GetMapping("/listar")
//     public String listaringredientes(Model model) {

//         model.addAttribute("listIngredientes", ingredientesServicio.listaingredinetes());

//         model.addAttribute("funcionalidad", "lista");

//         model.addAttribute("tipoLista", "Eliminar");

//         model.addAttribute("estados", "ACTIVO");

//         model.addAttribute("ruta1", "/ingredientes/eliminar");

//         return "ingredientes";
//     }

//     @GetMapping("/listar-Eliminados")
//     public String listarEliminados(Model model) {

//         model.addAttribute("listIngredientes", ingredientesServicio.listaingredinetes());

//         model.addAttribute("funcionalidad", "lista");

//         model.addAttribute("tipoLista", "Activar");

//         model.addAttribute("estados", "ELIMINADO");

//         model.addAttribute("ruta1", "/ingredientes/activar");

//         return "ingredientes";
//     }

//     // -----------------------------------------------------

//     @GetMapping("/formulario-registrar")
//     public String listarActivos(Model model) {

//         model.addAttribute("ingredientes", new Ingredientes());

//         model.addAttribute("listaIngredientes",ingredientesServicio.listaingredinetes());
        
//         model.addAttribute("funcionalidad", "formulario");



//         model.addAttribute("ruta", "/ingredientes/registrar");

//         return "ingredientes";
//     }

//     @PostMapping("/registrar")
//     public String registrar(@ModelAttribute Ingredientes ingredientes) {

//         ingredientes.setEstado(Estado.ACTIVO);

//         ingredientesServicio.guardar(ingredientes);

//         return "redirect:/ingredientes/listar";
//     }

//     // --------------------------------------------------

//     @GetMapping("/formulario-modificar/{id}")
//     public String modificar(@PathVariable Long id, Model model) {

//         model.addAttribute("funcionalidad", "formulario");

//         model.addAttribute("ingredientes", ingredientesServicio.buscarPorId(id));

//         model.addAttribute("ruta", "/ingredientes/modificar");


//         return "ingredientes";

//     }

//     @PostMapping("/modificar")
//     public String modificar(@ModelAttribute Ingredientes ingredientes) {

//      Ingredientes resultado = ingredientesServicio.buscarPorId(ingredientes.getIdIngredientes());

//         ingredientes.setEstado(resultado.getEstado());

//         ingredientesServicio.guardar(ingredientes);

//         return "redirect:/ingredientes/listar";
//     }

//     // --------------------------------------------------

//     @PostMapping("/eliminar")
//     public String eliminarIngrediente(@RequestParam Long idIngredientes) {

//         Ingredientes ingredientes = ingredientesServicio.buscarPorId(idIngredientes);

//         ingredientes.setEstado(Estado.ELIMINADO);

//         ingredientesServicio.guardar(ingredientes);

//         return "redirect:/ingredientes/listar";
//     }

//     @PostMapping("/activar")
//     public String activarIngrediente(@RequestParam Long idIngredientes) {

//         Ingredientes ingredientes;

//         ingredientes = ingredientesServicio.buscarPorId(idIngredientes);

//         ingredientes.setEstado(Estado.ACTIVO);

//         ingredientesServicio.guardar(ingredientes);

//         return "redirect:/ingredientes/listar";
//     }

// }
