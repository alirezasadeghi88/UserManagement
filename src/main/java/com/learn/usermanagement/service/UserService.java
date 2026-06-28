package com.learn.usermanagement.service;

import com.learn.usermanagement.model.User;
import com.learn.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User update(Long id, User newData) {
        Optional<User> userOpt = userRepository.findById(id);
        User user = userOpt.get();

        if (newData.getFirstname() != null && newData.getFirstname().isEmpty()
            && newData.getFirstname().equals("")) {
            user.setFirstname(newData.getFirstname());
        }

        if (newData.getLastname() != null && newData.getLastname().isEmpty()
            && newData.getLastname().equals("")) {
            user.setFirstname(newData.getFirstname());
        }
    }
}
