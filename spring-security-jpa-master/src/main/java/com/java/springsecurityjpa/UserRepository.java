package com.java.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springsecurityjpa.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
