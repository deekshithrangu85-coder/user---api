package com.deekshith.userapi.controller;
import org.springframework.web.bind.annotation.*;
import com.deekshith.userapi.entity.User;
import com.deekshith.userapi.service.UserService;
import com.deekshith.userapi.dto.UserDTO;
import jakarta.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User createUser(@RequestBody @Valid UserDTO userDTO) {
        return userService.saveUserWithOrders(userDTO);
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}