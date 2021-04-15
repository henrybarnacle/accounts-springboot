package com.example.blockchain.demo.controller;

@RestController
public class UserController {
    @RequestMapping("/user")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
