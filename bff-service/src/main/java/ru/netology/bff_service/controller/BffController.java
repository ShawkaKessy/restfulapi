package ru.netology.bff_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.bff_service.dto.UserProfile;
import ru.netology.bff_service.dto.User;
import ru.netology.bff_service.dto.Order;
import ru.netology.bff_service.service.UserService;
import ru.netology.bff_service.service.OrderService;

import java.util.List;

@RestController
public class BffController {

    private final UserService userService;
    private final OrderService orderService;

    @Autowired
    public BffController(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    @GetMapping("/userProfile/{userId}")
    public UserProfile getUserProfile(@PathVariable Long userId) {
        User user = userService.getUser(userId);  // исправлено: getUserById -> getUser
        List<Order> orders = orderService.getOrders(userId);  // исправлено: getOrdersByUserId -> getOrders

        UserProfile userProfile = new UserProfile();
        userProfile.setUser(user);
        userProfile.setOrders(orders);
        return userProfile;
    }
}
