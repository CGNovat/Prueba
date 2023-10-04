package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/facultad")
@Controller
public class FacultadController {

    @Autowired
    // private IFacultadService facultadService;

 @GetMapping(value = "/vista")
    public String mot(){

        return "index";

    }
    
}
