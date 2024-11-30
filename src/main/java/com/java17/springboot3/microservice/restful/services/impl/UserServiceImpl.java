package com.java17.springboot3.microservice.restful.services.impl;

import com.java17.springboot3.microservice.restful.models.UserModel;
import com.java17.springboot3.microservice.restful.repositories.UserRepository;
import com.java17.springboot3.microservice.restful.services.UserService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hume Cristian
 * @version 1.0.0
 * @since 2024-11-25
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserModel> findAll() {
        List<UserModel> userModelList = new ArrayList<>();

        userModelList = userRepository.FindAll();

        return userModelList;
    }

}
