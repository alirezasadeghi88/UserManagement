package com.learn.usermanagement.controller;

import com.learn.usermanagement.repository.UserRepository;
import com.learn.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserRepository userRepository;
    private final UserService service;

    public UserController(UserRepository userRepository, UserService service) {
        this.userRepository = userRepository;
        this.service = service;
    }
}
