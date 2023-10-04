package com.example.demo.Controller;



import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




import lombok.RequiredArgsConstructor;

@RequestMapping("/almacen")
// Se aplica a nivel clase y a nivel metodo en el controlador.
// nivel de clase: Se define una URL base común para todos los métodos del
// controlador.
// nivel de método: Se especifica la URL específica para ese método.

/* ---------------------------------------------------------------------- */
@RequiredArgsConstructor
/*
 * Cuando se aplica Lombok generará automáticamente un constructor que tomará
 * como argumentos todos
 * los campos marcados como final o aquellos campos que no tengan una asignación
 */

/* ---------------------------------------------------------------------- */
@Controller
/* se utiliza para marcar una clase como un controlador de Spring MVC */

public class AlmacenController {

}
