package com.deekshith.userapi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deekshith.userapi.entity.User;
import com.deekshith.userapi.repository.UserRepository;
import java.util.List;
import com.deekshith.userapi.dto.UserDTO;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }
}