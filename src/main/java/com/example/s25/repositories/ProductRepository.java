package com.example.s25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.s25.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
