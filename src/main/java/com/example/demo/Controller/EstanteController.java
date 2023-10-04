package com.example.demo.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modelo.Entity.Estado;
import com.example.demo.modelo.Entity.Estante;
import com.example.demo.modelo.Entity.Ingredientes;
import com.example.demo.modelo.Servicio.interfaces.IAlmacenServicie;
import com.example.demo.modelo.Servicio.interfaces.IEstanteServicio;
import com.example.demo.modelo.Servicio.interfaces.IIngredientesServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/estante")
@Controller
public class EstanteController {

    private final IEstanteServicio estanteServicio;

    private final IAlmacenServicie almacenServicie;

    private final IIngredientesServicio ingredientesServicio;

    /*-----------------------------------------------------------------------
          Funciones para mostrar los estantes dependiendo del estado 
    -----------------------------------------------------------------------*/

    // --------------------Metodo para mostrar los estantes activos-------------

    @GetMapping("/listar")
    public String listarestante(Model model, @RequestParam(required = false) String nombreUnico,
            @RequestParam(required = false, defaultValue = "ACTIVO") String estado) {

        model.addAttribute("estante", new Estante());

        Estado[] lestado = Estado.values();

        model.addAttribute("listEstado", lestado);

        // -----------------------------------------------------

        List<Estante> listaEstantes;

        if (nombreUnico != null && estado != "ELIMINADO") {

            listaEstantes = estanteServicio.BuscarSimilaresANombreUnico(nombreUnico);

        } else {

            listaEstantes = estanteServicio.listestante();

        }

        // -----------------------------------------------------

        model.addAttribute("estados", "ACTIVO");

        // model.addAttribute("Identificador", "Dato que se desea enviar")
        model.addAttribute("listaEstante", listaEstantes);

        model.addAttribute("funcionalidad", "lista");

        model.addAttribute("tipoLista", "Eliminar");

        model.addAttribute("ruta1", "/estante/eliminar");

        // ---------------------------------------------------------

        return "estante";
    }

    // --------Metodo para mostrar los estantes Eliminados------------

    @GetMapping("/listar-eliminados")
    public String listarEstanteEliminados(Model model) {

        model.addAttribute("listaEstante", estanteServicio.listestante());

        model.addAttribute("funcionalidad", "lista");

        model.addAttribute("tipoLista", "Activar");

        model.addAttribute("ruta1", "/estante/activar");

        model.addAttribute("estados", "ELIMINADO");

        return "estante";
    }

    /*-----------------------------------------------------------------------
                    Funciones 
    -----------------------------------------------------------------------*/

    // -------------------------------------
    @GetMapping("/formulario-registrar")
    public String formularioModificar(Model model) {

        model.addAttribute("estante", new Estante());

        model.addAttribute("listaAlmacenes", almacenServicie.listAlmacen());

        // -----------------------------------------------------

        List<Ingredientes> ingredientes = ingredientesServicio.listaingredinetes();

        model.addAttribute("listIngredientes", ingredientes);

        // -----------------------------------------------------

        Estado[] estado = Estado.values();

        model.addAttribute("listEstados", estado);

        // -----------------------------------------------------

        model.addAttribute("funcionalidad", "formulario");

        model.addAttribute("ruta", "/estante/registrar");

        // -----------------------------------------------------

        return "estante";
    }

    // -------------------------------------

    @PostMapping("/registrar")
    public String guardar(@ModelAttribute Estante estante) {

        estante.setFechaRegistro(LocalDateTime.now());

        estanteServicio.guardar(estante);

        return "redirect:/estante/listar";
    }

    /*-----------------------------------------------------------------------
                    Funciones para modificar los datos del estante
    -----------------------------------------------------------------------*/

    // -----Metodo para enlazar los datos del estante a l model-----

    @GetMapping("/formulario-modificar/{id}")
    public String modificar(@PathVariable Long id, Model model) {

        model.addAttribute("funcionalidad", "formulario");

        model.addAttribute("estante", estanteServicio.buscarPorId(id));

        // ----------------------------------------------------

        List<Ingredientes> ingredientes = ingredientesServicio.listaingredinetes();

        model.addAttribute("listIngredientes", ingredientes);

        // -----------------------------------------------------

        Estado[] estado = Estado.values();

        model.addAttribute("listEstados", estado);

        // -----------------------------------------------------

        model.addAttribute("listaAlmacenes", almacenServicie.listAlmacen());

        model.addAttribute("ruta", "/estante/modificar");

        return "estante";
    }

    // ----Metodo para buscar el y mostrar los datos del estante----

    @PostMapping("/modificar")
    public String modificar(@ModelAttribute Estante estante) {

        estanteServicio.guardar(estante);

        return "redirect:/estante/listar";
    }

    /*-----------------------------------------------------------------------
                    Funciones Eliminar y Activar 
    -----------------------------------------------------------------------*/

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long idEstante) {

        Estante estante;

        estante = estanteServicio.buscarPorId(idEstante);

        estante.setEstado(Estado.ELIMINADO);

        estanteServicio.guardar(estante);

        return "redirect:/estante/listar";
    }

    // --------------------------------------------------------------

    @PostMapping("/activar")
    public String activar(@RequestParam Long idEstante) {

        Estante estante;

        estante = estanteServicio.buscarPorId(idEstante);

        estante.setEstado(Estado.ACTIVO);

        estanteServicio.guardar(estante);

        return "redirect:/estante/listar-eliminados";
    }

}