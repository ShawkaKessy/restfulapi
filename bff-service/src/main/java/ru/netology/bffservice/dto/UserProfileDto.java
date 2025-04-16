package ru.netology.bffservice.dto;

import ru.netology.bffservice.model.Order;
import ru.netology.bffservice.model.User;

import java.util.List;

public class UserProfileDto {
    private Long userId;
    private String fullName;
    private String email;
    private List<Order> orders;

    public UserProfileDto() {
    }

    public UserProfileDto(User user, List<Order> orders) {
        this.userId = user.getId();
        this.fullName = user.getFullName();
        this.email = user.getEmail();
        this.orders = orders;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
