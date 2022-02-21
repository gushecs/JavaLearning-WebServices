package com.example.s25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.s25.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
