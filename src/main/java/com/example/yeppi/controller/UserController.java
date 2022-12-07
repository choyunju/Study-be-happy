package com.example.yeppi.controller;

import com.example.yeppi.dto.SignupForm;
import com.example.yeppi.repository.UserRepository;
import com.example.yeppi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
// 사용자 계정 controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<SignupForm> userSignupCreate(@RequestBody SignupForm form){
        log.info(form.toString());

        SignupForm createdDto = userService.create(form);

        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }
}
