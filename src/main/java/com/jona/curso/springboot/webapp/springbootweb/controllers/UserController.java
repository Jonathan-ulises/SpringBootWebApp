package com.jona.curso.springboot.webapp.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Jonathan");
        model.addAttribute("lastname", "Sanchez");
        return "details";
    }

    // Ejemplo usando Map
    // @GetMapping("/details")
    // public String details(Map<String, Object> model) {
    //     model.put("title", "Hola mundo Spring Boot");
    //     model.put("name", "Jonathan");
    //     model.put("lastname", "Sanchez");
    //     return "details";
    // }
}
