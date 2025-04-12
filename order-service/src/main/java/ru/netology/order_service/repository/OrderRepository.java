package ru.netology.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.order_service.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
