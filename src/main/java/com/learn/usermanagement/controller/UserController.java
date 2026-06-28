package com.learn.usermanagement.controller;

import com.learn.usermanagement.model.User;
import com.learn.usermanagement.repository.UserRepository;
import com.learn.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserRepository userRepository;
    private final UserService service;

    public UserController(UserRepository userRepository, UserService service) {
        this.userRepository = userRepository;
        this.service = service;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> userList() {
        return userRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }
}
