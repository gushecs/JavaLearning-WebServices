package com.example.s25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.s25.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
