package com.java17.springboot3.microservice.restful.controllers;

import com.java17.springboot3.microservice.restful.models.UserModel;
import com.java17.springboot3.microservice.restful.services.UserService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hume Cristian
 * @version 1.0.0
 * @since 2024-11-25
 */
@RestController
@RequestMapping("/java/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public List<UserModel> findAll() {
        List<UserModel> userModelList = new ArrayList<>();

        userModelList = userService.findAll();

        return userModelList;
    }
}
