package com.example.blockchain.demo.controller;

import com.example.blockchain.demo.model.Users;
import com.example.blockchain.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> find() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public Users save(@RequestBody Users body) {
        return userRepository.save(body);
    }

}
