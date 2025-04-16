package ru.netology.orderservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "currency")
    private String currency;

    @ElementCollection
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "items")
    private List<String> items;

    // Геттеры и сеттеры

}
