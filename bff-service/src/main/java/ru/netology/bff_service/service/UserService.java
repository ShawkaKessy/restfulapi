package ru.netology.bff_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import ru.netology.bff_service.dto.User;

@Service
public class UserService {

    private final RestTemplate restTemplate;
    private final String userServiceUrl;

    public UserService(RestTemplate restTemplate, @Value("${user.service.url}") String userServiceUrl) {
        this.restTemplate = restTemplate;
        this.userServiceUrl = userServiceUrl;
    }

    public User getUser(Long userId) {
        String url = userServiceUrl + "/users/" + userId;
        return restTemplate.getForObject(url, User.class);
    }
}
