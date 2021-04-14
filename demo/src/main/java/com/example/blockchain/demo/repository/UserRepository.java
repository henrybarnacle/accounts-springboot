package com.example.blockchain.demo.repository;

import com.example.blockchain.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}


