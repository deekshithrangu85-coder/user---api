package com.deekshith.userapi.controller;
import com.deekshith.userapi.dto.UserDTO;
import com.deekshith.userapi.entity.User;
import com.deekshith.userapi.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ CREATE USER (POST)
    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO userDTO) {
        User user = userService.saveUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // ✅ UPDATE USER (PUT)
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}