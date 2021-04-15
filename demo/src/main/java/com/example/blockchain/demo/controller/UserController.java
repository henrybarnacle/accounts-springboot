package com.example.blockchain.demo.controller;

import com.example.blockchain.demo.model.Users;
import com.example.blockchain.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public Users save(@RequestBody Users body) {
        return userRepository.save(body);
    }

}
