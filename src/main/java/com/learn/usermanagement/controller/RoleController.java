package com.learn.usermanagement.controller;

import com.learn.usermanagement.repository.RoleRepository;
import com.learn.usermanagement.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Role")
public class RoleController {
    private final RoleRepository repository;
    private final RoleService service;

    public RoleController(RoleRepository repository, RoleService service) {
        this.repository = repository;
        this.service = service;
    }
}
