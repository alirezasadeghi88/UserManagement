package com.learn.usermanagement.service;

import com.learn.usermanagement.model.Role;
import com.learn.usermanagement.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public Role update(Long id, Role newData) {
        Optional<Role> roleOpt = repository.findById(id);

        Role role = roleOpt.get();



    }
}
