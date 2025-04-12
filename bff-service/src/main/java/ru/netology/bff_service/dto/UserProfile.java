package ru.netology.bff_service.dto;

import java.util.List;

public class UserProfile {
    private User user;
    private List<Order> orders;

    // Геттеры и сеттеры
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
