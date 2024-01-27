package com.jona.curso.springboot.webapp.springbootweb.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jona.curso.springboot.webapp.springbootweb.models.User;
import com.jona.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Jonathan", "Sanchez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Jonathan", "Sanchez");
        User user2 = new User("Oscar", "Alan");
        User user3 = new User("Luis", "Aranda");
        
        List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    // Forma con Map
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Jonathan", "Sanchez");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
