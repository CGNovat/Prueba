// package com.example.demo.Controller;



// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// import com.example.demo.modelo.Entity.Almacen;
// import com.example.demo.modelo.Entity.Estado;
// import com.example.demo.modelo.Servicio.interfaces.IAlmacenServicie;

// import lombok.RequiredArgsConstructor;

// @RequestMapping("/almacen")
// Se aplica a nivel clase y a nivel metodo en el controlador.
// nivel de clase: Se define una URL base común para todos los métodos del
// controlador.
// nivel de método: Se especifica la URL específica para ese método.

/* ---------------------------------------------------------------------- */
// @RequiredArgsConstructor
/*
 * Cuando se aplica Lombok generará automáticamente un constructor que tomará
 * como argumentos todos
 * los campos marcados como final o aquellos campos que no tengan una asignación
 */

/* ---------------------------------------------------------------------- */



// @Controller
/* se utiliza para marcar una clase como un controlador de Spring MVC */

// public class AlmacenController {

//     private final IAlmacenServicie almacenServicie;
    //

    /*-----------------------------------------------------------------------
                    Funciones para mostrar los almacenes dependiendo del estado 
    -----------------------------------------------------------------------*/

    // ------------Metodo para mostrar los almacenes activos-------------

    // se utiliza para mapear o asociar una solicitud HTTP GET a
    // un método específico dentro de un controlador de Spring.

    // @GetMapping("/listar")
    // public String listarAlmacen(Model model, @RequestParam(required = false) String nombreUnico) {

    //     List<Almacen> listaAlmacen;

    //     if (nombreUnico != null) {

    //         listaAlmacen = almacenServicie.BuscarSimilaresANombreUnico(nombreUnico);

    //     } else {

    //         listaAlmacen = almacenServicie.listAlmacen();

    //     }

        // model.addAttribute("Identificador", "Dato que se desea enviar")

        // model.addAttribute("listaAlmacenes", listaAlmacen);

        // -----------------------Variables Thymeleaf---------------------

    //     model.addAttribute("tipobusqueda", "/almacen/listar");

    //     model.addAttribute("funcionalidad", "lista");

    //     model.addAttribute("tipoLista", "Eliminar");

    //     model.addAttribute("ruta1", "/almacen/eliminar");

    //     model.addAttribute("estados", "ACTIVO");

    //     return "almacen";
    // }
    
    // -----------------------------------------------------------------
    // --------Metodo para mostrar los almacenes Eliminados------------
    // -----------------------------------------------------------------

    // @GetMapping("/listar-eliminados")
    // public String listarAlmacenEliminados(Model model, @RequestParam(required = false) String nombreUnico) {

    //     List<Almacen> listaAlmacen;

    //     if (nombreUnico != null) {

    //         listaAlmacen = almacenServicie.BuscarSimilaresANombreUnico(nombreUnico);

    //     } else {

    //         listaAlmacen = almacenServicie.listAlmacen();

    //     }

        // model.addAttribute("Identificador", "valor del dato")

        // model.addAttribute("listaAlmacenes", listaAlmacen);

        // ----------------------Variables Thymeleaf----------------------

    //     model.addAttribute("tipobusqueda", "/almacen/listar-eliminados");

    //     model.addAttribute("funcionalidad", "lista");

    //     model.addAttribute("tipoLista", "Activar");

    //     model.addAttribute("ruta1", "/almacen/activar");

    //     model.addAttribute("estados", "ELIMINADO");

    //     return "almacen";
    // }

    /*-----------------------------------------------------------------------
                Funciones para registrar un almacen
    -----------------------------------------------------------------------*/

    // ---------Metodo para vincular los datos al objeto almacen------------

    // @GetMapping("/formulario-registrar")
    // public String mostrarFormularioRegistro(Model model) {

    //     model.addAttribute("almacen", new Almacen());

    //     // --------------------Variables Thymeleaf---------------------
    //     model.addAttribute("funcionalidad", "formulario");

    //     model.addAttribute("tipoFormulario", "registrar");

    //     model.addAttribute("ruta", "/almacen/registrar");

    //     return "almacen";
    // }

    // ---------Metodo para guardar los datos delalmacen--------------

    // @PostMapping("/registrar")
    // public String registrar(@ModelAttribute Almacen almacen, RedirectAttributes flash) {

    //     almacen.setEstado(Estado.ACTIVO);

    //     almacenServicie.guardar(almacen);

        // --------------------Variables Thymeleaf---------------------
    //     flash.addFlashAttribute("exitoso", "Almacen Registrado");

    //     return "redirect:/almacen/listar";
    // }

    /*-----------------------------------------------------------------------
                    Funciones para modificar los datos del almacen
    -----------------------------------------------------------------------*/

    // ----Metodo para buscar el y mostrar los datos del almacen-------

    // @GetMapping("/formulario-modificar/{id}")
    // public String mostrarFormularioModificacion(Model model, @PathVariable Long id) {

        // @PathVariable: es utilizada en controladores para extraer valores de
        // variables de la URL (URI) y mapearlos
        // a los parámetros de un método. Esta anotación permite capturar partes
        // variables de la URL y
        // utilizar esos valores como argumentos en los métodos del controlador.

        // model.addAttribute("almacen", almacenServicie.buscarPorId(id));

        // --------------------Variables Thymeleaf---------------------

    //     model.addAttribute("funcionalidad", "formulario");

    //     model.addAttribute("tipoFormulario", "modificar");

    //     model.addAttribute("ruta", "/almacen/modificar");

    //     return "almacen";
    // }

    // -------Metodo para guardar los datos modificados del almacen----------

    // @PostMapping("/modificar")
    // public String modificar(@ModelAttribute Almacen almacen, RedirectAttributes flash) {

        // @ModelAttribute: se utiliza para enlazar automáticamente los datos de un
        // formulario HTML o los parámetros de
        // una solicitud HTTP con los atributos de un modelo (objeto) en un controlador.
        // Esta anotación
        // se usa comúnmente para recibir datos del cliente y luego procesarlos o
        // mostrarlos en una vista.

        // En metodos post: para enlazar automáticamente los datos enviados desde un
        // formulario HTML
        // con los atributos de un modelo. Esto facilita la recuperación y procesamiento
        // de los datos del formulario.

    //     almacen.setEstado(Estado.ACTIVO);

    //     almacenServicie.guardar(almacen);

    //     flash.addFlashAttribute("exitoso", "Almacen Modificado");

    //     return "redirect:/almacen/listar";

    // }

    /*-----------------------------------------------------------------------
                    Funciones de eliminar y Activar un almacen
    -----------------------------------------------------------------------*/

    // -----------------------Metodo para eliminar un almacen---------------

    // @PostMapping("/eliminar")
    // public String eliminar(@RequestParam Long idAlmacen, RedirectAttributes flash) {

    //     Almacen almacen;

    //     almacen = almacenServicie.buscarPorId(idAlmacen);

    //     almacen.setEstado(Estado.ELIMINADO);

    //     almacenServicie.guardar(almacen);

    //     flash.addFlashAttribute("exitoso", "Almacen Eliminado");

    //     return "redirect:/almacen/listar";
    // }

    // ----------------------Metodo para eliminar un almacen-------------

    // @PostMapping("/activar")
    // public String activar(@RequestParam Long idAlmacen, RedirectAttributes flash) {

    //     Almacen almacen;

    //     almacen = almacenServicie.buscarPorId(idAlmacen);

    //     almacen.setEstado(Estado.ACTIVO);

    //     almacenServicie.guardar(almacen);

    //     flash.addFlashAttribute("exitoso", "Almacen Activo");

    //     return "redirect:/almacen/listar-eliminados";
        
    // }

    /*-----------------------------------------
    
    

}-------------------------------------------*/
