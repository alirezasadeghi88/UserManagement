package com.learn.usermanagement.controller;

import com.learn.usermanagement.model.Role;
import com.learn.usermanagement.repository.RoleRepository;
import com.learn.usermanagement.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Role")
public class RoleController {
    private final RoleRepository repository;
    private final RoleService service;

    public RoleController(RoleRepository repository, RoleService service) {
        this.repository = repository;
        this.service = service;
    }

    @PostMapping
    public Role save(@RequestBody Role role) {
        return repository.save(role);
    }

    @GetMapping
    public List<Role> roleList() {
        return repository.findAll();
    }
}
