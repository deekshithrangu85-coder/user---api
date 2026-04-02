package com.deekshith.userapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deekshith.userapi.entity.User;
import com.deekshith.userapi.entity.Order;
import com.deekshith.userapi.repository.UserRepository;
import com.deekshith.userapi.dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUserWithOrders(UserDTO dto) {

        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        List<Order> orders = dto.getOrders().stream().map(orderDTO -> {

            Order order = new Order();
            order.setProductName(orderDTO.getProductName());
            order.setPrice(orderDTO.getPrice());

            order.setUser(user);

            return order;

        }).collect(Collectors.toList());

        user.setOrders(orders);

        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}