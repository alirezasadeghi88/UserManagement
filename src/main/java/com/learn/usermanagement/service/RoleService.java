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


        if (newData.getName() != null && !newData.getName().isEmpty() && !newData.getName().equals("")) {
            role.setName(newData.getName());
        }

        if (newData.getUsers() != null) {
            role.getUsers().clear();
            role.getUsers().addAll(newData.getUsers());
        }

        return repository.save(role);
    }
}
