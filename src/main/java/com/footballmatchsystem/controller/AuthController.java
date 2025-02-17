package com.footballmatchsystem.controller;

import com.footballmatchsystem.dto.LoginRequest;
import com.footballmatchsystem.model.User;
import com.footballmatchsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController     {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
       boolean isValid = userRepository.findByUsername(request.getUsername())
               .map(user -> user.getPassword().equals(request.getPassword()))
               .orElse(false);

       return isValid ? ResponseEntity.ok("Login Successfully")
               : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Username or Password wrong");
    }
}
