package ru.netology.bffservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.netology.bffservice.model.User;
import ru.netology.bffservice.model.Order;
import ru.netology.bffservice.dto.UserProfileDto;

import java.util.Arrays;
import java.util.List;

@Service
public class UserProfileService {

    private final RestTemplate restTemplate;
    private final String userServiceUrl = "http://localhost:8080/api/users/";
    private final String orderServiceUrl = "http://localhost:8082/orders/user/";

    public UserProfileService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserProfileDto getUserProfile(Long userId) {
        User user = restTemplate.getForObject(userServiceUrl + userId, User.class);
        Order[] orders = restTemplate.getForObject(orderServiceUrl + userId, Order[].class);
        return new UserProfileDto(user, orders != null ? Arrays.asList(orders) : List.of());
    }
}
