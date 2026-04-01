package com.deekshith.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deekshith.userapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}