package com.jona.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Teener varias rutas en un handle method
    @GetMapping({"", "/", "/home"})
    public String home() {
        // Ejemplo de redireccion a otras vistas
        return "redirect:/details";
        // return "forward:/details";
    }

}
