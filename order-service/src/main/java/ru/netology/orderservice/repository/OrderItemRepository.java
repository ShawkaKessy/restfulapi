package ru.netology.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.orderservice.model.Order;
import ru.netology.orderservice.model.OrderItem;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
