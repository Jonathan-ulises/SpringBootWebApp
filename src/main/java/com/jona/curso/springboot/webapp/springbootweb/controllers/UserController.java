package com.jona.curso.springboot.webapp.springbootweb.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jona.curso.springboot.webapp.springbootweb.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Jonathan", "Sanchez");
        user.setEmail("jonUli@correo.com");

        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);
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

    @GetMapping("/list")
    public String list(ModelMap model) {
        // Se va a reutilizar con @ModalAttribute
        // List<User> users = Arrays.asList(
        //     new User("Jonathan", "Ulises"),
        //     new User("Luis", "Ernesto", "lernes@email.com"),
        //     new User("Oscar", "Alan", "oalan@email.com"),
        //     new User("Alan", "Ramirez")
        // );
        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios");
        return "list";
    }

    /*
     * Sirve usa para reutilizar valores en todo el controlador.
     * Se puede usar el atribute "users" en las vistas que se esten usando en este controlador
     * con thymeleaft.
     */
    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
            new User("Jonathan", "Ulises"),
            new User("Luis", "Ernesto", "lernes@email.com"),
            new User("Oscar", "Alan", "oalan@email.com"),
            new User("Alan", "Ramirez")
        );
        return users;
    }
    
}
