package ru.netology.bff_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import ru.netology.bff_service.dto.Order;

import java.util.List;

@Service
public class OrderService {

    private final RestTemplate restTemplate;
    private final String orderServiceUrl;

    public OrderService(RestTemplate restTemplate, @Value("${order.service.url}") String orderServiceUrl) {
        this.restTemplate = restTemplate;
        this.orderServiceUrl = orderServiceUrl;
    }

    public List<Order> getOrders(Long userId) {
        String url = orderServiceUrl + "/orders/user/" + userId;
        return restTemplate.getForObject(url, List.class);
    }
}
