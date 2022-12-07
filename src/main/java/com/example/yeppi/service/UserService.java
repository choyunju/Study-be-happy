package com.example.yeppi.service;

import com.example.yeppi.dto.SignupForm;
import com.example.yeppi.entity.User;
import com.example.yeppi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public SignupForm create(SignupForm dto) {
        User user = User.create(dto);

        User created = userRepository.save(user);

        return SignupForm.createDto(created);
    }
}