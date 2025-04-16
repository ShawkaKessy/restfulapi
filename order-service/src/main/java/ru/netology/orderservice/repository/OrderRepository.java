package ru.netology.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.orderservice.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}