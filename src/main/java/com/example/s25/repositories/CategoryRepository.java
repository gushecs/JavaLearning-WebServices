package com.example.s25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.s25.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
