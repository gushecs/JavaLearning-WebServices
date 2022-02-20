package com.example.s25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.s25.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
